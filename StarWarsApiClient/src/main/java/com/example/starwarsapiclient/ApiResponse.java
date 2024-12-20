package com.example.starwarsapiclient;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

/**
 * Класс для представления ответа API с обобщённым типом данных.
 * Он включает в себя общие поля, такие как количество результатов,
 * а также ссылки на следующую и предыдущую страницу.
 *
 * @param <T> Тип объектов, содержащихся в списке результатов.
 */
public class ApiResponse<T> {

    // Логгер для этого класса
    private static final Logger logger = LogManager.getLogger(ApiResponse.class);

    private int count;  // Количество элементов в ответе.
    private String next;  // Ссылка на следующую страницу.
    private String previous;  // Ссылка на предыдущую страницу.
    private List<T> results;  // Список результатов.

    /**
     * Возвращает количество элементов в ответе.
     *
     * @return Количество элементов.
     */
    public int getCount() {
        logger.debug("Getting count: " + count); // Логируем доступ к count
        return count;
    }

    /**
     * Устанавливает количество элементов в ответе.
     *
     * @param count Количество элементов.
     */
    public void setCount(int count) {
        logger.info("Setting count to: " + count); // Логируем установку count
        this.count = count;
    }

    /**
     * Возвращает ссылку на следующую страницу.
     *
     * @return Ссылка на следующую страницу.
     */
    public String getNext() {
        logger.debug("Getting next page URL: " + next); // Логируем доступ к next
        return next;
    }

    /**
     * Устанавливает ссылку на следующую страницу.
     *
     * @param next Ссылка на следующую страницу.
     */
    public void setNext(String next) {
        if (next == null) {
            logger.warn("Next page URL is null!"); // Логируем предупреждение, если next пустое
        }
        logger.info("Setting next page URL to: " + next); // Логируем установку next
        this.next = next;
    }

    /**
     * Возвращает ссылку на предыдущую страницу.
     *
     * @return Ссылка на предыдущую страницу.
     */
    public String getPrevious() {
        logger.debug("Getting previous page URL: " + previous); // Логируем доступ к previous
        return previous;
    }

    /**
     * Устанавливает ссылку на предыдущую страницу.
     *
     * @param previous Ссылка на предыдущую страницу.
     */
    public void setPrevious(String previous) {
        if (previous == null) {
            logger.warn("Previous page URL is null!"); // Логируем предупреждение, если previous пустое
        }
        logger.info("Setting previous page URL to: " + previous); // Логируем установку previous
        this.previous = previous;
    }

    /**
     * Возвращает список результатов, содержащий объекты типа T.
     *
     * @return Список объектов типа T.
     */
    public List<T> getResults() {
        logger.debug("Getting results list of size: " + (results != null ? results.size() : "null")); // Логируем доступ к results
        return results;
    }

    /**
     * Устанавливает список результатов.
     *
     * @param results Список объектов типа T.
     */
    public void setResults(List<T> results) {
        if (results == null) {
            logger.error("Results list is null!"); // Логируем ошибку, если results равен null
        }
        logger.info("Setting results list with " + (results != null ? results.size() : "null") + " items."); // Логируем установку results
        this.results = results;
    }
}
