package com.example.starwarsapiclient;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

/**
 * Класс, содержащий словари для преобразования названий персонажей, планет и фильмов
 * на английский язык, для дальнейшего запроса к API Star Wars.
 * <p>
 * Этот класс содержит статические словари для каждого типа данных: персонажи, планеты, фильмы.
 * Он используется для поиска и замены русских имен на их английские аналоги.
 */
public class QueryDictionary {

    // Логгер для класса QueryDictionary
    private static final Logger logger = LogManager.getLogger(QueryDictionary.class);

    // Словари для каждого типа запроса
    private static final Map<String, String> characters = new HashMap<>();
    private static final Map<String, String> planets = new HashMap<>();
    private static final Map<String, String> films = new HashMap<>();

    static {
        // Логируем инициализацию словарей
        logger.info("Initializing QueryDictionary...");

        // Персонажи
        characters.put("Люк Скайуокер", "Luke Skywalker");
        characters.put("C-3PO", "C-3PO");
        characters.put("Р2-Д2", "R2-D2");
        characters.put("Дарт Вейдер", "Darth Vader");
        characters.put("Лея Органа", "Leia Organa");
        characters.put("Оуэн Ларс", "Owen Lars");
        characters.put("Беруа Уайтсан Ларс", "Beru Whitesun Lars");
        characters.put("R5-D4", "R5-D4");
        characters.put("Биггс Дарклайтнер", "Biggs Darklighter");
        characters.put("Оби-Ван Кеноби", "Obi-Wan Kenobi");

        // Планеты
        planets.put("Татуин", "Tatooine");
        planets.put("Алдераан", "Alderaan");
        planets.put("Хота", "Hoth");
        planets.put("Таяр", "Dagobah");
        planets.put("Беспин", "Bespin");
        planets.put("Эндор", "Endor");
        planets.put("Набу", "Naboo");
        planets.put("Корусан", "Coruscant");
        planets.put("Хаз", "Kamino");

        // Фильмы
        films.put("Звездные Войны: Эпизод IV — Новая надежда", "Star Wars: Episode IV - A New Hope");
        films.put("Звездные Войны: Эпизод V — Империя наносит ответный удар", "Star Wars: Episode V - The Empire Strikes Back");
        films.put("Звездные Войны: Эпизод VI — Возвращение джедая", "Star Wars: Episode VI - Return of the Jedi");
        films.put("Звездные Войны: Эпизод I — Скрытая угроза", "Star Wars: Episode I - The Phantom Menace");
        films.put("Звездные Войны: Эпизод II — Атака клонов", "Star Wars: Episode II - Attack of the Clones");
        films.put("Звездные Войны: Эпизод III — Месть ситхов", "Star Wars: Episode III - Revenge of the Sith");
        films.put("Звездные Войны: Эпизод VII — Пробуждение силы", "Star Wars: Episode VII - The Force Awakens");
        films.put("Звездные Войны: Эпизод VIII — Последние джедаи", "Star Wars: Episode VIII - The Last Jedi");
        films.put("Звездные Войны: Эпизод IX — Скайуокер. Восход", "Star Wars: Episode IX - The Rise of Skywalker");

        logger.info("QueryDictionary initialized successfully.");
    }
    /**
     * Метод для перевода запроса на русский в эквивалент на английском (для API).
     * Если запрос найден в одном из словарей (персонажи, планеты или фильмы),
     * возвращается его английский аналог. Если не найден, возвращается сам запрос.
     *
     * @param query запрос на русском языке.
     * @return эквивалент запроса на английском языке, если найден, иначе сам запрос.
     */
    public static String getEnglishQuery(String query) {
        if (characters.containsKey(query)) {
            return characters.get(query);
        } else if (planets.containsKey(query)) {
            return planets.get(query);
        } else if (films.containsKey(query)) {
            return films.get(query);
        } else {
            return query; // Если не нашли, возвращаем сам запрос
        }
    }
    /**
     * Метод для получения всех персонажей с парами (русский - английский).
     * Возвращает карту с именами персонажей, где ключ — русское имя, а значение — английское имя.
     *
     * @return словарь персонажей (русский - английский).
     */
    public static Map<String, String> getCharacters() {
        return characters; // Возвращаем сам словарь
    }

    /**
     * Метод для получения всех планет как Map<String, String>.
     * Возвращает карту с планетами, где ключ — русское название, а значение — английское.
     *
     * @return словарь планет (русский - английский).
     */
    public static Map<String, String> getPlanets() {
        return planets; // Возвращаем сам словарь
    }

    /**
     * Метод для получения всех фильмов как Map<String, String>.
     * Возвращает карту с фильмами, где ключ — русское название, а значение — английское.
     *
     * @return словарь фильмов (русский - английский).
     */
    public static Map<String, String> getFilms() {
        return films; // Возвращаем сам словарь
    }

    /**
     * Метод для получения всех запросов (персонажи, планеты и фильмы).
     * Возвращает множество всех ключей из словарей персонажей, планет и фильмов.
     *
     * @return множество всех запросов.
     */
    public static Set<String> getQueries() {
        Set<String> queries = new HashSet<>();
        queries.addAll(characters.keySet());
        queries.addAll(planets.keySet());
        queries.addAll(films.keySet());
        return queries;
    }
}
