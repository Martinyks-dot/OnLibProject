package com.example.starwarsapiclient;

import javafx.application.Application;
import javafx.stage.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Главный класс приложения для клиента Star Wars API.
 * Отвечает за запуск приложения, инициализацию сервисов и создание графического интерфейса.
 */
public class MainApp extends Application {

    // Логгер для класса MainApp, используя log4j
    private static final Logger logger = LogManager.getLogger(MainApp.class);
    private ApiService apiService;

    /**
     * Главный метод запуска приложения.
     * Этот метод вызывается для запуска JavaFX приложения.
     *
     * @param args аргументы командной строки, переданные при запуске приложения.
     */
    public static void main(String[] args) {
        // Логирование начала работы приложения с использованием log4j
        logger.info("Starting the Star Wars API Client application...");
        launch(args);
    }

    /**
     * Метод, вызываемый для настройки главной сцены приложения.
     * Инициализирует сервис для работы с API и контроллер GUI, настраивает сцену и отображает главное окно.
     *
     * @param primaryStage основной Stage (окно) приложения.
     */
    @Override
    public void start(Stage primaryStage) {
        // Логируем инициализацию сервиса API
        logger.info("Initializing API service...");
        apiService = new ApiService();  // Инициализация сервиса API
        GuiController guiController = new GuiController(apiService);  // Инициализация контроллера GUI

        // Настройка основного окна с сценой, созданной GuiController
        primaryStage.setTitle("Star Wars API Client");
        primaryStage.setScene(guiController.createMainScene());
        primaryStage.show();

        // Логируем успешный запуск приложения
        logger.info("Main window initialized successfully.");
    }
}
