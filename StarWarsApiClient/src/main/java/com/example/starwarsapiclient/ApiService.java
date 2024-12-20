package com.example.starwarsapiclient;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

/**
 * Сервис для взаимодействия с API Star Wars.
 * Включает методы для получения информации о персонажах, планетах и фильмах по имени.
 */
public class ApiService {

    // Логгер для логирования запросов и ответов
    private static final Logger logger = LogManager.getLogger(ApiService.class);

    private static final String BASE_URL = "https://swapi-api.hbtn.io/api/";

    /**
     * Универсальный метод для получения данных по имени.
     * Этот метод отправляет запрос к API, получает ответ и десериализует его в объект.
     *
     * @param url   Путь к ресурсу в API (например, "people", "planets", "films").
     * @param name  Имя, по которому будет осуществляться поиск.
     * @param clazz Класс, в который будет десериализован результат.
     * @param <T>   Тип данных, который ожидается в ответе.
     * @return Объект типа T, если результат найден, иначе null.
     */
    public <T> T getByName(String url, String name, Class<T> clazz) {
        // Переводим запрос через словарь, если нужно
        String englishQuery = QueryDictionary.getEnglishQuery(name);

        // Логируем отправляемый запрос
        logger.info("Отправляем запрос на: " + BASE_URL + url + "?search=" + englishQuery);

        // Отправляем GET-запрос
        Response response = RestAssured.get(BASE_URL + url + "?search=" + englishQuery);

        // Логируем ответ от API
        logger.info("Ответ API: " + response.getBody().asString());

        // Проверяем успешность запроса
        if (response.getStatusCode() == 200) {
            try {
                // Десериализуем JSON-ответ в объект ApiResponse
                ObjectMapper objectMapper = new ObjectMapper();
                ApiResponse<T> apiResponse = objectMapper.readValue(response.getBody().asString(),
                        objectMapper.getTypeFactory().constructParametricType(ApiResponse.class, clazz));

                // Проверяем, есть ли результаты
                if (apiResponse.getResults() != null && !apiResponse.getResults().isEmpty()) {
                    return apiResponse.getResults().get(0);  // Возвращаем первый результат
                } else {
                    logger.warn("Объект не найден по запросу: " + name);
                    return null;
                }
            } catch (IOException e) {
                logger.error("Ошибка десериализации ответа API: " + e.getMessage(), e);
                return null;
            }
        } else {
            logger.error("Ошибка запроса, код ответа: " + response.getStatusCode());
            return null;
        }
    }

    /**
     * Метод для получения персонажа по имени.
     *
     * @param name Имя персонажа.
     * @return Объект типа CharacterDTO, если найден.
     */
    public CharacterDTO getCharacterByName(String name) {
        logger.info("Получение персонажа по имени: " + name);
        return getByName("people", name, CharacterDTO.class);
    }

    /**
     * Метод для получения планеты по имени.
     *
     * @param name Имя планеты.
     * @return Объект типа PlanetDTO, если найден.
     */
    public PlanetDTO getPlanetByName(String name) {
        logger.info("Получение планеты по имени: " + name);
        return getByName("planets", name, PlanetDTO.class);
    }

    /**
     * Метод для получения фильма по имени.
     *
     * @param name Название фильма.
     * @return Объект типа FilmDTO, если найден.
     */
    public FilmDTO getFilmByName(String name) {
        logger.info("Получение фильма по названию: " + name);
        return getByName("films", name, FilmDTO.class);
    }
}
