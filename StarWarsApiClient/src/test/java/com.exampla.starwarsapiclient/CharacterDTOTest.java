package com.example.starwarsapiclient;

import org.junit.Assert;
import org.junit.Test;

public class CharacterDTOTest {

    @Test
    public void testCharacterDTO_GettersAndSetters() {
        CharacterDTO character = new CharacterDTO();

        character.setName("Luke Skywalker");
        character.setHeight("172");
        character.setMass("77");
        character.setHair_color("Blond");
        character.setSkin_color("Fair");
        character.setEye_color("Blue");
        character.setBirth_year("19BBY");
        character.setGender("Male");
        character.setHomeworld("https://swapi.dev/api/planets/1/");
        character.setFilms(java.util.Arrays.asList("https://swapi.dev/api/films/1/"));
        character.setSpecies(java.util.Collections.emptyList());
        character.setVehicles(java.util.Arrays.asList("https://swapi.dev/api/vehicles/14/"));
        character.setStarships(java.util.Arrays.asList("https://swapi.dev/api/starships/12/"));
        character.setUrl("https://swapi.dev/api/people/1/");
        character.setCreated("2014-12-09T13:50:51.644000Z");
        character.setEdited("2014-12-20T21:17:56.891000Z");

        Assert.assertEquals("Luke Skywalker", character.getName());
        Assert.assertEquals("172", character.getHeight());
        Assert.assertEquals("77", character.getMass());
        Assert.assertEquals("Blond", character.getHair_color());
        Assert.assertEquals("Fair", character.getSkin_color());
        Assert.assertEquals("Blue", character.getEye_color());
        Assert.assertEquals("19BBY", character.getBirth_year());
        Assert.assertEquals("Male", character.getGender());
        Assert.assertEquals("https://swapi.dev/api/planets/1/", character.getHomeworld());
        Assert.assertEquals(1, character.getFilms().size());
        Assert.assertTrue(character.getSpecies().isEmpty());
        Assert.assertEquals(1, character.getVehicles().size());
        Assert.assertEquals(1, character.getStarships().size());
        Assert.assertEquals("https://swapi.dev/api/people/1/", character.getUrl());
        Assert.assertEquals("2014-12-09T13:50:51.644000Z", character.getCreated());
        Assert.assertEquals("2014-12-20T21:17:56.891000Z", character.getEdited());
    }
}
