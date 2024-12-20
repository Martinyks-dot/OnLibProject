package com.example.starwarsapiclient;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

/**
 * DTO класс для представления фильма из API Star Wars.
 * Содержит информацию о фильме, включая его название, эпизод, даты выпуска, а также связанные персонажи, планеты и другие объекты.
 */
public class FilmDTO {

    // Логгер для логирования работы с данным объектом
    private static final Logger logger = LogManager.getLogger(FilmDTO.class);

    private String title;
    private int episode_id;
    private String opening_crawl;
    private String director;
    private String producer;
    private String release_date;
    private List<String> characters;
    private List<String> planets;
    private List<String> starships;
    private List<String> vehicles;
    private List<String> species;
    private String created;
    private String edited;
    private String url;

    /**
     * Возвращает название фильма.
     *
     * @return Название фильма.
     */
    public String getTitle() {
        logger.debug("Getting title: " + title); // Логируем доступ к полю title
        return title;
    }

    /**
     * Устанавливает название фильма.
     *
     * @param title Название фильма.
     */
    public void setTitle(String title) {
        logger.info("Setting title: " + title); // Логируем установку значения title
        this.title = title;
    }

    /**
     * Возвращает идентификатор эпизода.
     *
     * @return Идентификатор эпизода.
     */
    public int getEpisode_id() {
        logger.debug("Getting episode ID: " + episode_id); // Логируем доступ к полю episode_id
        return episode_id;
    }

    /**
     * Устанавливает идентификатор эпизода.
     *
     * @param episode_id Идентификатор эпизода.
     */
    public void setEpisode_id(int episode_id) {
        logger.info("Setting episode ID: " + episode_id); // Логируем установку значения episode_id
        this.episode_id = episode_id;
    }

    /**
     * Возвращает начальный текст фильма (opening crawl).
     *
     * @return Начальный текст фильма.
     */
    public String getOpening_crawl() {
        logger.debug("Getting opening crawl: " + opening_crawl); // Логируем доступ к полю opening_crawl
        return opening_crawl;
    }

    /**
     * Устанавливает начальный текст фильма.
     *
     * @param opening_crawl Начальный текст фильма.
     */
    public void setOpening_crawl(String opening_crawl) {
        logger.info("Setting opening crawl: " + opening_crawl); // Логируем установку значения opening_crawl
        this.opening_crawl = opening_crawl;
    }

    /**
     * Возвращает имя режиссера.
     *
     * @return Имя режиссера.
     */
    public String getDirector() {
        logger.debug("Getting director: " + director); // Логируем доступ к полю director
        return director;
    }

    /**
     * Устанавливает имя режиссера.
     *
     * @param director Имя режиссера.
     */
    public void setDirector(String director) {
        logger.info("Setting director: " + director); // Логируем установку значения director
        this.director = director;
    }

    /**
     * Возвращает имя продюсера.
     *
     * @return Имя продюсера.
     */
    public String getProducer() {
        logger.debug("Getting producer: " + producer); // Логируем доступ к полю producer
        return producer;
    }

    /**
     * Устанавливает имя продюсера.
     *
     * @param producer Имя продюсера.
     */
    public void setProducer(String producer) {
        logger.info("Setting producer: " + producer); // Логируем установку значения producer
        this.producer = producer;
    }

    /**
     * Возвращает дату выпуска фильма.
     *
     * @return Дата выпуска фильма.
     */
    public String getRelease_date() {
        logger.debug("Getting release date: " + release_date); // Логируем доступ к полю release_date
        return release_date;
    }

    /**
     * Устанавливает дату выпуска фильма.
     *
     * @param release_date Дата выпуска фильма.
     */
    public void setRelease_date(String release_date) {
        logger.info("Setting release date: " + release_date); // Логируем установку значения release_date
        this.release_date = release_date;
    }

    /**
     * Возвращает список персонажей, связанных с фильмом.
     *
     * @return Список персонажей.
     */
    public List<String> getCharacters() {
        logger.debug("Getting characters list: " + (characters != null ? characters.size() : "null")); // Логируем доступ к полю characters
        return characters;
    }

    /**
     * Устанавливает список персонажей.
     *
     * @param characters Список персонажей.
     */
    public void setCharacters(List<String> characters) {
        logger.info("Setting characters list with " + (characters != null ? characters.size() : "null") + " items."); // Логируем установку списка characters
        this.characters = characters;
    }

    /**
     * Возвращает список планет, связанных с фильмом.
     *
     * @return Список планет.
     */
    public List<String> getPlanets() {
        logger.debug("Getting planets list: " + (planets != null ? planets.size() : "null")); // Логируем доступ к полю planets
        return planets;
    }

    /**
     * Устанавливает список планет.
     *
     * @param planets Список планет.
     */
    public void setPlanets(List<String> planets) {
        logger.info("Setting planets list with " + (planets != null ? planets.size() : "null") + " items."); // Логируем установку списка planets
        this.planets = planets;
    }

    /**
     * Возвращает список звездных кораблей, связанных с фильмом.
     *
     * @return Список звездных кораблей.
     */
    public List<String> getStarships() {
        logger.debug("Getting starships list: " + (starships != null ? starships.size() : "null")); // Логируем доступ к полю starships
        return starships;
    }

    /**
     * Устанавливает список звездных кораблей.
     *
     * @param starships Список звездных кораблей.
     */
    public void setStarships(List<String> starships) {
        logger.info("Setting starships list with " + (starships != null ? starships.size() : "null") + " items."); // Логируем установку списка starships
        this.starships = starships;
    }

    /**
     * Возвращает список транспортных средств, связанных с фильмом.
     *
     * @return Список транспортных средств.
     */
    public List<String> getVehicles() {
        logger.debug("Getting vehicles list: " + (vehicles != null ? vehicles.size() : "null")); // Логируем доступ к полю vehicles
        return vehicles;
    }

    /**
     * Устанавливает список транспортных средств.
     *
     * @param vehicles Список транспортных средств.
     */
    public void setVehicles(List<String> vehicles) {
        logger.info("Setting vehicles list with " + (vehicles != null ? vehicles.size() : "null") + " items."); // Логируем установку списка vehicles
        this.vehicles = vehicles;
    }

    /**
     * Возвращает список видов существ, связанных с фильмом.
     *
     * @return Список видов существ.
     */
    public List<String> getSpecies() {
        logger.debug("Getting species list: " + (species != null ? species.size() : "null")); // Логируем доступ к полю species
        return species;
    }

    /**
     * Устанавливает список видов существ.
     *
     * @param species Список видов существ.
     */
    public void setSpecies(List<String> species) {
        logger.info("Setting species list with " + (species != null ? species.size() : "null") + " items."); // Логируем установку списка species
        this.species = species;
    }

    /**
     * Возвращает дату создания фильма.
     *
     * @return Дата создания.
     */
    public String getCreated() {
        logger.debug("Getting created date: " + created); // Логируем доступ к полю created
        return created;
    }

    /**
     * Устанавливает дату создания фильма.
     *
     * @param created Дата создания фильма.
     */
    public void setCreated(String created) {
        logger.info("Setting created date: " + created); // Логируем установку значения created
        this.created = created;
    }

    /**
     * Возвращает дату последнего редактирования фильма.
     *
     * @return Дата последнего редактирования.
     */
    public void setEdited(String edited) {
        logger.info("Setting edited date: " + edited); // Логируем установку значения edited
        this.edited = edited;
    }

    /**
     * Возвращает URL фильма.
     *
     * @return URL фильма.
     */
    public String getUrl() {
        logger.debug("Getting URL: " + url); // Логируем доступ к полю url
        return url;
    }

    /**
     * Устанавливает URL фильма.
     *
     * @param url URL фильма.
     */
    public void setUrl(String url) {
        logger.info("Setting URL: " + url); // Логируем установку значения url
        this.url = url;
    }
}