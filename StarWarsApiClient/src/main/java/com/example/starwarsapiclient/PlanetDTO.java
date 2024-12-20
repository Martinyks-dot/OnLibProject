package com.example.starwarsapiclient;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Класс, представляющий данные о планете в системе Star Wars.
 * Содержит поля для различных характеристик планеты, таких как её диаметр, климат, гравитация и так далее.
 * Также содержит списки для фильмов и жителей планеты.
 */
public class PlanetDTO {
    // Логгер для класса PlanetDTO
    private static final Logger logger = LogManager.getLogger(PlanetDTO.class);

    private String name;  // Название планеты
    private String rotation_period;  // Период вращения планеты
    private String orbital_period;  // Орбитальный период
    private String diameter;  // Диаметр планеты
    private String climate;  // Климат планеты
    private String gravity;  // Гравитация планеты
    private String terrain;  // Территория планеты
    private String surface_water;  // Поверхностная вода
    private String population;  // Население планеты
    private List<String> residents;  // Список жителей планеты
    private List<String> films;  // Список фильмов, в которых эта планета появляется
    private String created;  // Дата создания записи
    private String edited;  // Дата последнего редактирования записи
    private String url;  // URL для доступа к данным о планете


// Геттер для поля name (название планеты)

    /**
     * Получает название планеты.
     *
     * @return название планеты.
     */
    public String getName() {
        logger.debug("Getting the name of the planet: " + name);
        return name;
    }

    // Сеттер для поля name (название планеты)

    /**
     * Устанавливает название планеты.
     *
     * @param name название планеты.
     */
    public void setName(String name) {
        logger.debug("Setting the name of the planet: " + name);
        this.name = name;
    }

    // Геттер для поля rotation_period (период вращения планеты)

    /**
     * Получает период вращения планеты.
     *
     * @return период вращения планеты.
     */
    public String getRotation_period() {
        logger.debug("Getting the rotation period of the planet: " + rotation_period);
        return rotation_period;
    }

    // Сеттер для поля rotation_period (период вращения планеты)

    /**
     * Устанавливает период вращения планеты.
     *
     * @param rotation_period период вращения планеты.
     */
    public void setRotation_period(String rotation_period) {
        logger.debug("Setting the rotation period of the planet: " + rotation_period);
        this.rotation_period = rotation_period;
    }

    // Геттер для поля orbital_period (орбитальный период планеты)

    /**
     * Получает орбитальный период планеты.
     *
     * @return орбитальный период планеты.
     */
    public String getOrbital_period() {
        logger.debug("Getting the orbital period of the planet: " + orbital_period);
        return orbital_period;
    }

    // Сеттер для поля orbital_period (орбитальный период планеты)

    /**
     * Устанавливает орбитальный период планеты.
     *
     * @param orbital_period орбитальный период планеты.
     */
    public void setOrbital_period(String orbital_period) {
        logger.debug("Setting the orbital period of the planet: " + orbital_period);
        this.orbital_period = orbital_period;
    }

    // Геттер для поля diameter (диаметр планеты)

    /**
     * Получает диаметр планеты.
     *
     * @return диаметр планеты.
     */
    public String getDiameter() {
        logger.debug("Getting the diameter of the planet: " + diameter);
        return diameter;
    }

    // Сеттер для поля diameter (диаметр планеты)

    /**
     * Устанавливает диаметр планеты.
     *
     * @param diameter диаметр планеты.
     */
    public void setDiameter(String diameter) {
        logger.debug("Setting the diameter of the planet: " + diameter);
        this.diameter = diameter;
    }


// Геттер для поля climate (климат планеты)

    /**
     * Получает климат планеты.
     *
     * @return климат планеты.
     */
    public String getClimate() {
        logger.debug("Getting the climate of the planet: " + climate);
        return climate;
    }

    // Сеттер для поля climate (климат планеты)

    /**
     * Устанавливает климат планеты.
     *
     * @param climate климат планеты.
     */
    public void setClimate(String climate) {
        logger.debug("Setting the climate of the planet: " + climate);
        this.climate = climate;
    }

    // Геттер для поля gravity (гравитация планеты)

    /**
     * Получает гравитацию планеты.
     *
     * @return гравитация планеты.
     */
    public String getGravity() {
        logger.debug("Getting the gravity of the planet: " + gravity);
        return gravity;
    }

    // Сеттер для поля gravity (гравитация планеты)

    /**
     * Устанавливает гравитацию планеты.
     *
     * @param gravity гравитация планеты.
     */
    public void setGravity(String gravity) {
        logger.debug("Setting the gravity of the planet: " + gravity);
        this.gravity = gravity;
    }

    // Геттер для поля terrain (рельеф планеты)

    /**
     * Получает рельеф планеты.
     *
     * @return рельеф планеты.
     */
    public String getTerrain() {
        logger.debug("Getting the terrain of the planet: " + terrain);
        return terrain;
    }

    // Сеттер для поля terrain (рельеф планеты)

    /**
     * Устанавливает рельеф планеты.
     *
     * @param terrain рельеф планеты.
     */
    public void setTerrain(String terrain) {
        logger.debug("Setting the terrain of the planet: " + terrain);
        this.terrain = terrain;
    }

    // Геттер для поля surface_water (вода на поверхности планеты)

    /**
     * Получает информацию о воде на поверхности планеты.
     *
     * @return информация о воде на поверхности.
     */
    public String getSurface_water() {
        logger.debug("Getting the surface water of the planet: " + surface_water);
        return surface_water;
    }

    // Сеттер для поля surface_water (вода на поверхности планеты)

    /**
     * Устанавливает информацию о воде на поверхности планеты.
     *
     * @param surface_water информация о воде на поверхности.
     */
    public void setSurface_water(String surface_water) {
        logger.debug("Setting the surface water of the planet: " + surface_water);
        this.surface_water = surface_water;
    }

    // Геттер для поля population (население планеты)

    /**
     * Получает население планеты.
     *
     * @return население планеты.
     */
    public String getPopulation() {
        logger.debug("Getting the population of the planet: " + population);
        return population;
    }

    // Сеттер для поля population (население планеты)

    /**
     * Устанавливает население планеты.
     *
     * @param population население планеты.
     */
    public void setPopulation(String population) {
        logger.debug("Setting the population of the planet: " + population);
        this.population = population;
    }

    // Геттер для поля residents (жители планеты)

    /**
     * Получает список жителей планеты.
     *
     * @return список жителей планеты.
     */
    public List<String> getResidents() {
        logger.debug("Getting the residents of the planet");
        return residents;
    }

    // Сеттер для поля residents (жители планеты)

    /**
     * Устанавливает список жителей планеты.
     *
     * @param residents список жителей планеты.
     */
    public void setResidents(List<String> residents) {
        logger.debug("Setting the residents of the planet: " + residents);
        this.residents = residents;
    }

    // Геттер для поля films (фильмы, в которых появляется планета)

    /**
     * Получает список фильмов, в которых появляется планета.
     *
     * @return список фильмов.
     */
    public List<String> getFilms() {
        logger.debug("Getting the films where the planet appears");
        return films;
    }

    // Сеттер для поля films (фильмы, в которых появляется планета)

    /**
     * Устанавливает список фильмов, в которых появляется планета.
     *
     * @param films список фильмов.
     */
    public void setFilms(List<String> films) {
        logger.debug("Setting the films where the planet appears: " + films);
        this.films = films;
    }

    // Геттер для поля created (время создания планеты)

    /**
     * Получает время создания планеты.
     *
     * @return время создания планеты.
     */
    public String getCreated() {
        logger.debug("Getting the creation date of the planet: " + created);
        return created;
    }

    // Сеттер для поля created (время создания планеты)

    /**
     * Устанавливает время создания планеты.
     *
     * @param created время создания планеты.
     */
    public void setCreated(String created) {
        logger.debug("Setting the creation date of the planet: " + created);
        this.created = created;
    }

    // Геттер для поля edited (время последнего редактирования планеты)

    /**
     * Получает время последнего редактирования планеты.
     *
     * @return время последнего редактирования планеты.
     */
    public String getEdited() {
        logger.debug("Getting the last edited date of the planet: " + edited);
        return edited;
    }

    // Сеттер для поля edited (время последнего редактирования планеты)

    /**
     * Устанавливает время последнего редактирования планеты.
     *
     * @param edited время последнего редактирования планеты.
     */
    public void setEdited(String edited) {
        logger.debug("Setting the last edited date of the planet: " + edited);
        this.edited = edited;
    }

// Геттер для поля url (URL планеты)

    /**
     * Получает URL планеты.
     *
     * @return URL планеты.
     */
    public String getUrl() {
        logger.debug("Getting the URL of the planet: " + url);
        return url;
    }

    // Сеттер для поля url (URL планеты)

    /**
     * Устанавливает URL планеты.
     *
     * @param url URL планеты.
     */
    public void setUrl(String url) {
        logger.debug("Setting the URL of the planet: " + url);
        this.url = url;
    }


// Переопределенный метод toString для представления объекта PlanetDTO в виде строки

    /**
     * Возвращает строковое представление объекта планеты с основными характеристиками.
     * Это строковое представление содержит информацию о климате, рельефе, диаметре, гравитации,
     * популяции и фильмах, в которых планета появляется.
     *
     * @return строковое представление планеты с её характеристиками.
     */
    @Override
    public String toString() {
        logger.info("Converting PlanetDTO to string...");

        String planetInfo = "Планета: " + name + "\n" +
                "Климат: " + climate + "\n" +
                "Рельеф: " + terrain + "\n" +
                "Диаметр: " + diameter + "\n" +
                "Гравитация: " + gravity + "\n" +
                "Популяция: " + population + "\n" +
                "Фильмы: " + String.join(", ", films);

        logger.debug("PlanetDTO string representation: " + planetInfo);

        return planetInfo;
    }
}