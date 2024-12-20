package com.example.starwarsapiclient;

import org.junit.Assert;
import org.junit.Test;

public class QueryDictionaryTest {

    @Test
    public void testGetEnglishQuery_Characters() {
        Assert.assertEquals("Luke Skywalker", QueryDictionary.getEnglishQuery("Люк Скайуокер"));
        Assert.assertEquals("C-3PO", QueryDictionary.getEnglishQuery("C-3PO"));
        Assert.assertEquals("R2-D2", QueryDictionary.getEnglishQuery("Р2-Д2"));
        Assert.assertEquals("Darth Vader", QueryDictionary.getEnglishQuery("Дарт Вейдер"));
        Assert.assertEquals("Leia Organa", QueryDictionary.getEnglishQuery("Лея Органа"));
    }

    @Test
    public void testGetEnglishQuery_Planets() {
        Assert.assertEquals("Tatooine", QueryDictionary.getEnglishQuery("Татуин"));
        Assert.assertEquals("Alderaan", QueryDictionary.getEnglishQuery("Алдераан"));
        Assert.assertEquals("Hoth", QueryDictionary.getEnglishQuery("Хота"));
        Assert.assertEquals("Dagobah", QueryDictionary.getEnglishQuery("Таяр"));
        Assert.assertEquals("Bespin", QueryDictionary.getEnglishQuery("Беспин"));
    }

    @Test
    public void testGetEnglishQuery_Films() {
        Assert.assertEquals("Star Wars: Episode IV - A New Hope",
                QueryDictionary.getEnglishQuery("Звездные Войны: Эпизод IV — Новая надежда"));
        Assert.assertEquals("Star Wars: Episode V - The Empire Strikes Back",
                QueryDictionary.getEnglishQuery("Звездные Войны: Эпизод V — Империя наносит ответный удар"));
        Assert.assertEquals("Star Wars: Episode VI - Return of the Jedi",
                QueryDictionary.getEnglishQuery("Звездные Войны: Эпизод VI — Возвращение джедая"));
    }

    @Test
    public void testGetEnglishQuery_UnknownQuery() {
        // Тестируем поведение для неизвестного запроса
        Assert.assertEquals("Unknown Query", QueryDictionary.getEnglishQuery("Unknown Query"));
    }

    @Test
    public void testGetQueries() {
        // Проверяем, что набор всех запросов содержит ожидаемые элементы
        Assert.assertTrue(QueryDictionary.getQueries().contains("Люк Скайуокер"));
        Assert.assertTrue(QueryDictionary.getQueries().contains("Татуин"));
        Assert.assertTrue(QueryDictionary.getQueries().contains("Звездные Войны: Эпизод IV — Новая надежда"));
    }
}
