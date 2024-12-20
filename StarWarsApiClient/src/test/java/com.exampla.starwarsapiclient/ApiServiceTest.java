package com.example.starwarsapiclient;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ApiServiceTest {

    private ApiService apiService;

    @Before
    public void setUp() {
        apiService = new ApiService();
    }

    @Test
    public void testGetCharacterByName_Found() {
        String characterName = "Люк Скайуокер";
        CharacterDTO character = apiService.getCharacterByName(characterName);
        Assert.assertNotNull("Character should not be null", character);
        Assert.assertEquals("Luke Skywalker", character.getName());
    }

    @Test
    public void testGetCharacterByName_NotFound() {
        String characterName = "Неизвестный Персонаж";
        CharacterDTO character = apiService.getCharacterByName(characterName);
        Assert.assertNull("Character should be null for unknown name", character);
    }

    @Test
    public void testGetPlanetByName_Found() {
        String planetName = "Татуин";
        PlanetDTO planet = apiService.getPlanetByName(planetName);
        Assert.assertNotNull("Planet should not be null", planet);
        Assert.assertEquals("Tatooine", planet.getName());
    }

    @Test
    public void testGetPlanetByName_NotFound() {
        String planetName = "Неизвестная Планета";
        PlanetDTO planet = apiService.getPlanetByName(planetName);
        Assert.assertNull("Planet should be null for unknown name", planet);
    }

    @Test
    public void testGetFilmByName_NotFound() {
        String filmName = "Неизвестный Фильм";
        FilmDTO film = apiService.getFilmByName(filmName);
        Assert.assertNull("Film should be null for unknown name", film);
    }
}
