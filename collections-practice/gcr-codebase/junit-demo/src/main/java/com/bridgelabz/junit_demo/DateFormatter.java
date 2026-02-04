package com.bridgelabz.junit_demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {

    /**
     * Converts a date from yyyy-MM-dd format to dd-MM-yyyy format.
     * @param inputDate - input string in yyyy-MM-dd
     * @return string formatted as dd-MM-yyyy
     * @throws IllegalArgumentException if input is invalid or date doesn't exist
     */
    public static String formatDate(String inputDate) {
        if (inputDate == null) {
            throw new IllegalArgumentException("Input date cannot be null");
        }
        try {
            LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format. Expected yyyy-MM-dd.", e);
        }
    }
}
