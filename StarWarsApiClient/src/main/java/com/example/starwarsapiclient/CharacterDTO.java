package com.example.starwarsapiclient;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

/**
 * DTO класс для представления персонажа из API Star Wars.
 * Содержит информацию о персонаже, включая его имя, рост, массу, цвет волос и глаз, а также связанные фильмы, виды существ и другие объекты.
 */
public class CharacterDTO {

    private static final Logger logger = LogManager.getLogger(CharacterDTO.class); // Logger instanc

    private String name;
    private String height;
    private String mass;
    private String hair_color;
    private String skin_color;
    private String eye_color;
    private String birth_year;
    private String gender;
    private String homeworld;
    private List<String> films;
    private List<String> species;
    private List<String> vehicles;
    private List<String> starships;
    private String url; // Добавляем поле url
    private String created;
    private String edited;

    /**
     * Получить имя персонажа.
     *
     * @return имя персонажа.
     */
    public String getName() {
        logger.debug("Getting character name: " + name);
        return name;
    }
    /**
     * Установить имя персонажа.
     *
     * @param name имя персонажа.
     */
    public void setName(String name) {
        logger.debug("Setting character name: " + name); // Logging setting of name
        this.name = name;
    }

    /**
     * Получить рост персонажа.
     *
     * @return рост персонажа.
     */
    public String getHeight() {
        logger.debug("Getting character height: " + height); // Logging retrieval of height
        return height;
    }

    /**
     * Установить рост персонажа.
     *
     * @param height рост персонажа.
     */
    public void setHeight(String height) {
        logger.debug("Setting character height: " + height); // Logging setting of height
        this.height = height;
    }

    /**
     * Получить массу персонажа.
     *
     * @return масса персонажа.
     */
    public String getMass() {
        logger.debug("Getting character mass: " + mass); // Logging retrieval of mass
        return mass;
    }
    /**
     * Установить массу персонажа.
     *
     * @param mass масса персонажа.
     */
    public void setMass(String mass) {
        logger.debug("Setting character mass: " + mass); // Logging setting of mass
        this.mass = mass;
    }

    /**
     * Получить цвет волос персонажа.
     *
     * @return цвет волос.
     */
    public String getHair_color() {
        logger.debug("Getting character hair color: " + hair_color); // Logging retrieval of hair color
        return hair_color;
    }

    /**
     * Установить цвет волос персонажа.
     *
     * @param hair_color цвет волос.
     */
    public void setHair_color(String hair_color) {
        logger.debug("Setting character hair color: " + hair_color); // Logging setting of hair color
        this.hair_color = hair_color;
    }

    /**
     * Получить цвет кожи персонажа.
     *
     * @return цвет кожи персонажа.
     */
    public String getSkin_color() {
        logger.debug("Getting character skin color: " + skin_color); // Logging retrieval of skin color
        return skin_color;
    }


    /**
     * Установить цвет кожи персонажа.
     *
     * @param skin_color цвет кожи.
     */
    public void setSkin_color(String skin_color) {
        logger.debug("Setting character skin color: " + skin_color); // Logging setting of skin color
        this.skin_color = skin_color;
    }

    /**
     * Получить цвет глаз персонажа.
     *
     * @return цвет глаз персонажа.
     */
    public String getEye_color() {
        logger.debug("Getting character eye color: " + eye_color); // Logging retrieval of eye color
        return eye_color;
    }
    /**
     * Установить цвет глаз персонажа.
     *
     * @param eye_color цвет глаз.
     */
    public void setEye_color(String eye_color) {
        logger.debug("Setting character eye color: " + eye_color); // Logging setting of eye color
        this.eye_color = eye_color;
    }

    /**
     * Получить год рождения персонажа.
     *
     * @return год рождения.
     */
    public String getBirth_year() {
        logger.debug("Getting character birth year: " + birth_year); // Logging retrieval of birth year
        return birth_year;
    }

    /**
     * Установить год рождения персонажа.
     *
     * @param birth_year год рождения.
     */
    public void setBirth_year(String birth_year) {
        logger.debug("Setting character birth year: " + birth_year); // Logging setting of birth year
        this.birth_year = birth_year;
    }


    /**
     * Получить пол персонажа.
     *
     * @return пол персонажа.
     */
    public String getGender() {
        logger.debug("Getting character gender: " + gender); // Logging retrieval of gender
        return gender;
    }

    /**
     * Установить пол персонажа.
     *
     * @param gender пол персонажа.
     */
    public void setGender(String gender) {
        logger.debug("Setting character gender: " + gender); // Logging setting of gender
        this.gender = gender;
    }
    /**
     * Получить родную планету персонажа.
     *
     * @return родная планета.
     */
    public String getHomeworld() {
        logger.debug("Getting character homeworld: " + homeworld); // Logging retrieval of homeworld
        return homeworld;
    }

    /**
     * Установить родную планету персонажа.
     *
     * @param homeworld родная планета.
     */
    public void setHomeworld(String homeworld) {
        logger.debug("Setting character homeworld: " + homeworld); // Logging setting of homeworld
        this.homeworld = homeworld;
    }

    /**
     * Получить список фильмов, в которых персонаж появляется.
     *
     * @return список фильмов.
     */
    public List<String> getFilms() {
        logger.debug("Getting character films: " + films); // Logging retrieval of films
        return films;
    }

    /**
     * Установить список фильмов, в которых персонаж появляется.
     *
     * @param films список фильмов.
     */
    public void setFilms(List<String> films) {
        logger.debug("Setting character films: " + films); // Logging setting of films
        this.films = films;
    }

    /**
     * Получить список видов, к которым принадлежит персонаж.
     *
     * @return список видов.
     */
    public List<String> getSpecies() {
        logger.debug("Getting character species: " + species); // Logging retrieval of species
        return species;
    }

    /**
     * Установить список видов, к которым принадлежит персонаж.
     *
     * @param species список видов.
     */
    public void setSpecies(List<String> species) {
        logger.debug("Setting character species: " + species); // Logging setting of species
        this.species = species;
    }

    /**
     * Получить список транспортных средств персонажа.
     *
     * @return список транспортных средств.
     */
    public List<String> getVehicles() {
        logger.debug("Getting character vehicles: " + vehicles); // Logging retrieval of vehicles
        return vehicles;
    }

    /**
     * Установить список транспортных средств персонажа.
     *
     * @param vehicles список транспортных средств.
     */
    public void setVehicles(List<String> vehicles) {
        logger.debug("Setting character vehicles: " + vehicles); // Logging setting of vehicles
        this.vehicles = vehicles;
    }

    /**
     * Получить список звездолетов персонажа.
     *
     * @return список звездолетов.
     */
    public List<String> getStarships() {
        logger.debug("Getting character starships: " + starships); // Logging retrieval of starships
        return starships;
    }

    /**
     * Установить список звездолетов персонажа.
     *
     * @param starships список звездолетов.
     */
    public void setStarships(List<String> starships) {
        logger.debug("Setting character starships: " + starships); // Logging setting of starships
        this.starships = starships;
    }

    /**
     * Получить URL персонажа.
     *
     * @return URL персонажа.
     */
    public String getUrl() {
        logger.debug("Getting character URL: " + url); // Logging retrieval of URL
        return url;
    }

    /**
     * Установить URL персонажа.
     *
     * @param url URL персонажа.
     */
    public void setUrl(String url) {
        logger.debug("Setting character URL: " + url); // Logging setting of URL
        this.url = url;
    }
    /**
     * Получить дату создания записи персонажа.
     *
     * @return дата создания.
     */
    public String getCreated() {
        logger.debug("Getting character created date: " + created); // Logging retrieval of created date
        return created;
    }

    /**
     * Устанавливает дату создания персонажа.
     *
     * @param created Дата создания персонажа.
     */
    public void setCreated(String created) {
        logger.debug("Setting created date for character: " + created); // Log the set operation
        this.created = created;
    }

    /**
     * Получить дату редактирования персонажа.
     *
     * @return Дата редактирования персонажа.
     */
    public String getEdited() {
        logger.debug("Getting edited date for character: " + edited); // Log the get operation
        return edited;
    }

    /**
     * Устанавливает дату редактирования персонажа.
     *
     * @param edited Дата редактирования персонажа.
     */
    public void setEdited(String edited) {
        logger.debug("Setting edited date for character: " + edited); // Log the set operation
        this.edited = edited;
    }
}

