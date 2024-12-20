package com.example.starwarsapiclient;

import javafx.beans.property.SimpleStringProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

public class GuiController {

    private static final Logger logger = LogManager.getLogger(GuiController.class); // Logger instance
    private ApiService apiService;

    public GuiController(ApiService apiService) {
        this.apiService = apiService;
    }

    /**
     * Метод для инициализации интерфейса и возврата сцены.
     * Этот метод настраивает основные компоненты пользовательского интерфейса, такие как метки,
     * кнопки и ввод запроса.
     *
     * @return Scene - главная сцена приложения.
     */
    public Scene createMainScene() {
        // Заголовок
        Label promptLabel = new Label("Выберите тип запроса и введите название:");
        promptLabel.setStyle("-fx-font-size: 16px; -fx-text-fill: #ecf0f1;");

        // Логотип
        Image logoImage = new Image(getClass().getResourceAsStream("/images/logo.png"));
        ImageView logoImageView = new ImageView(logoImage);
        logoImageView.setFitWidth(450);
        logoImageView.setFitHeight(400);

        // Выпадающий список для выбора типа запроса
        ComboBox<String> queryTypeComboBox = new ComboBox<>();
        queryTypeComboBox.getItems().addAll("Персонаж", "Планета", "Фильм");
        queryTypeComboBox.setValue("Персонаж");
        queryTypeComboBox.setStyle("-fx-font-size: 14px; -fx-padding: 10px;");
        queryTypeComboBox.setMaxWidth(300);
        queryTypeComboBox.setPrefWidth(300);

        // Поле для ввода
        TextField searchField = new TextField();
        searchField.setPromptText("Например: Luke Skywalker");
        searchField.setStyle("-fx-font-size: 14px; -fx-padding: 10px;");

        // Кнопка поиска
        Button searchButton = new Button("Найти");
        searchButton.setStyle("-fx-background-color: #3498db; -fx-text-fill: white; -fx-font-size: 14px; -fx-padding: 10px;");

        // Область для вывода результатов
        TextArea resultArea = new TextArea();
        resultArea.setEditable(false);
        resultArea.setStyle("-fx-font-size: 14px; -fx-text-fill: #151414; -fx-background-color: #34495e; -fx-border-radius: 5px;");
        resultArea.setPrefWidth(650);
        resultArea.setPrefHeight(450);

        // Логика обработки нажатия кнопки поиска
        searchButton.setOnAction(e -> {
            String name = searchField.getText().trim();
            String selectedType = queryTypeComboBox.getValue();
            try {
                if (!name.isEmpty()) {
                    switch (selectedType) {
                        case "Персонаж":
                            CharacterDTO character = apiService.getCharacterByName(name);
                            if (character != null) {
                                resultArea.setText(formatCharacterData(character));
                            } else {
                                resultArea.setText("Персонаж не найден.");
                            }
                            break;
                        case "Планета":
                            PlanetDTO planet = apiService.getPlanetByName(name);
                            if (planet != null) {
                                resultArea.setText(formatPlanetData(planet));
                            } else {
                                resultArea.setText("Планета не найдена.");
                            }
                            break;
                        case "Фильм":
                            FilmDTO film = apiService.getFilmByName(name);
                            if (film != null) {
                                resultArea.setText(formatFilmData(film));
                            } else {
                                resultArea.setText("Фильм не найден.");
                            }
                            break;
                        default:
                            resultArea.setText("Выберите правильный тип запроса.");
                            break;
                    }
                } else {
                    resultArea.setText("Пожалуйста, введите название.");
                }
            } catch (Exception ex) {
                resultArea.setText("Произошла ошибка.");
                ExceptionHandler.logException(ex);  // Логирование ошибки
                ExceptionHandler.printException(ex); // Печать ошибки в консоль
            }
        });

        // Кнопка для открытия словаря
        Button showDictionaryButton = new Button("Показать словарь запросов");
        showDictionaryButton.setStyle("-fx-background-color: #e74c3c; -fx-text-fill: white; -fx-font-size: 14px; -fx-padding: 10px;");

        // Логика открытия нового окна со словарем
        showDictionaryButton.setOnAction(e -> {
            Stage dictionaryStage = new Stage();
            dictionaryStage.setTitle("Словарь запросов");

            // Создаем таблицы для каждой категории
            TableView<String> charactersTable = createTable(QueryDictionary.getCharacters(), "Персонажи");
            TableView<String> planetsTable = createTable(QueryDictionary.getPlanets(), "Планеты");
            TableView<String> filmsTable = createTable(QueryDictionary.getFilms(), "Фильмы");


            // Layout для словаря
            VBox dictionaryLayout = new VBox(10);
            dictionaryLayout.setStyle("-fx-padding: 20; -fx-background-color: #34495e;");
            dictionaryLayout.getChildren().addAll(
                    new Label("Персонажи:"), charactersTable,
                    new Label("Планеты:"), planetsTable,
                    new Label("Фильмы:"), filmsTable
            );

            // Сцена для окна словаря
            Scene dictionaryScene = new Scene(dictionaryLayout, 500, 600);
            dictionaryStage.setScene(dictionaryScene);
            dictionaryStage.show();
        });

        // Основной layout
        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);
        layout.setStyle("-fx-padding: 30; -fx-background-color: #2C3E50;");
        layout.getChildren().addAll(
                logoImageView,
                promptLabel,
                queryTypeComboBox,
                searchField,
                searchButton,
                resultArea,
                showDictionaryButton
        );
        logger.info("Main scene created successfully.");
        return new Scene(layout, 600, 900);


    }

    // Метод для создания таблицы из списка
    private TableView<String> createTable(Map<String, String> dictionary, String category) {
        // Создаем таблицу
        TableView<String> table = new TableView<>();

        // Столбец для русского слова
        TableColumn<String, String> columnRussian = new TableColumn<>("Русский");
        columnRussian.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().split(" - ")[0])); // Парсинг русского слова

        // Столбец для английского слова
        TableColumn<String, String> columnEnglish = new TableColumn<>("Английский");
        columnEnglish.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().split(" - ")[1])); // Парсинг английского слова

        // Добавляем столбцы в таблицу
        table.getColumns().add(columnRussian);
        table.getColumns().add(columnEnglish);

        // Заполнение таблицы парами (русский - английский)
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            // Добавляем строку в виде "Русский - Английский"
            table.getItems().add(entry.getKey() + " - " + entry.getValue());
        }

        return table;
    }

    private String formatCharacterData(CharacterDTO character) {
        return "Имя: " + character.getName() + "\n" +
                "Рост: " + character.getHeight() + " см\n" +
                "Масса: " + character.getMass() + " кг\n" +
                "Цвет волос: " + character.getHair_color() + "\n" +
                "Цвет кожи: " + character.getSkin_color() + "\n" +
                "Цвет глаз: " + character.getEye_color() + "\n" +
                "Год рождения: " + character.getBirth_year() + "\n" +
                "Пол: " + character.getGender();
    }

    private String formatPlanetData(PlanetDTO planet) {
        return "Планета: " + planet.getName() + "\n" +
                "Климат: " + planet.getClimate() + "\n" +
                "Рельеф: " + planet.getTerrain() + "\n" +
                "Популяция: " + planet.getPopulation();
    }

    private String formatFilmData(FilmDTO film) {
        return "Название фильма: " + film.getTitle() + "\n" +
                "Эпизод: " + film.getEpisode_id() + "\n" +
                "Режиссер: " + film.getDirector() + "\n" +
                "Продюсер: " + film.getProducer() + "\n" +
                "Дата выпуска: " + film.getRelease_date();
    }
}
