package com.bridgelabz.junit_demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateFormatterTest {

    
    @Test
    public void testValidDate() {
        assertEquals("30-01-2026", DateFormatter.formatDate("2026-01-30"));
        assertEquals("01-12-2025", DateFormatter.formatDate("2025-12-01"));
    }


    @Test
    public void testInvalidDateFormat() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter.formatDate("30/01/2026"); // wrong format
        });
        assertTrue(ex.getMessage().contains("Invalid date format"));
    }


   


    
}
