package com.bridgelabz.junit_demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

   
    @Test
    public void testValidUser() {
        assertDoesNotThrow(() -> {
            UserRegistration.registerUser("Shivani", "shivani@example.com", "Password1");
        });
    }

    @Test
    public void testInvalidUsername() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("ab", "user@example.com", "Password1");
        });
        assertTrue(ex.getMessage().contains("Username must be at least 3 characters"));
    }

    @Test
    public void testInvalidEmail() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("Shivani", "shivaniatexample.com", "Password1");
        });
        assertTrue(ex.getMessage().contains("Invalid email format"));
    }

    @Test
    public void testShortPassword() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("Shivani", "shivani@example.com", "Pass1");
        });
        assertTrue(ex.getMessage().contains("Password must be at least 8 characters"));
    }

    
    @Test
    public void testPasswordNoUppercase() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("Shivani", "shivani@example.com", "password1");
        });
        assertTrue(ex.getMessage().contains("Password must be at least 8 characters"));
    }
    @Test
    public void testPasswordNoDigit() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("Shivani", "shivani@example.com", "Password");
        });
        assertTrue(ex.getMessage().contains("Password must be at least 8 characters"));
    }
}

