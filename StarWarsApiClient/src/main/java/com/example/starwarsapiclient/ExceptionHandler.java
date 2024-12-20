package com.example.starwarsapiclient;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Класс для обработки и логирования исключений и сообщений.
 * Предназначен для записи ошибок и других логов в файл с временными метками.
 */
public class ExceptionHandler {

    /**
     * Логирует исключение в файл {@code app_logs.txt}.
     * Формирует сообщение с временной меткой и информацией об исключении.
     * Если файл лога не существует, он будет создан.
     *
     * @param ex исключение, которое необходимо залогировать.
     */
    public static void logException(Exception ex) {
        try {
            // Создаем файл лога, если его нет
            File logFile = new File("app_logs.txt");
            if (!logFile.exists()) {
                logFile.createNewFile();
            }

            // Формируем сообщение об ошибке
            String errorMessage = formatErrorMessage(ex);

            // Записываем ошибку в файл
            try (FileWriter writer = new FileWriter(logFile, true)) {
                writer.write(errorMessage);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в лог: " + e.getMessage());
        }
    }

    /**
     * Логирует произвольное сообщение в файл {@code app_logs.txt}.
     * Формирует строку с временной меткой и записывает сообщение в файл.
     * Если файл лога не существует, он будет создан.
     *
     * @param message сообщение, которое нужно залогировать.
     */
    public static void logMessage(String message) {
        try {
            // Создаем файл лога, если его нет
            File logFile = new File("app_logs.txt");
            if (!logFile.exists()) {
                logFile.createNewFile();
            }

            // Формируем строку сообщения с временной меткой
            String logMessage = formatLogMessage(message);

            // Записываем сообщение в файл
            try (FileWriter writer = new FileWriter(logFile, true)) {
                writer.write(logMessage);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в лог: " + e.getMessage());
        }
    }

    /**
     * Форматирует сообщение об ошибке для записи в лог.
     * Включает временную метку и информацию о типе исключения и его сообщении.
     *
     * @param ex исключение для логирования.
     * @return отформатированное сообщение об ошибке.
     */
    private static String formatErrorMessage(Exception ex) {
        LocalDateTime timestamp = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return String.format("[%s] ERROR: %s - %s%n", timestamp.format(formatter), ex.getClass().getSimpleName(), ex.getMessage());
    }

    /**
     * Форматирует произвольное сообщение для записи в лог.
     * Включает временную метку.
     *
     * @param message сообщение для логирования.
     * @return отформатированное сообщение.
     */
    private static String formatLogMessage(String message) {
        LocalDateTime timestamp = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return String.format("[%s] INFO: %s%n", timestamp.format(formatter), message);
    }
    /**
     * Печатает исключение в консоль.
     *
     * @param ex исключение, которое нужно вывести.
     */
    public static void printException(Exception ex) {
        System.err.println("Ошибка: " + ex.getMessage());
        ex.printStackTrace();
    }
}


