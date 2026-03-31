package com.bridgelabz.junit_demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    @Test
    public void testValidPassword() {
        assertTrue(PasswordValidator.isValid("Abcdef12"));
        assertTrue(PasswordValidator.isValid("Password1"));
    }

    @Test
    public void testTooShortPassword() {
        assertFalse(PasswordValidator.isValid("Ab1"));
    }

    @Test
    public void testNoUppercase() {
        assertFalse(PasswordValidator.isValid("password1"));
    }

    @Test
    public void testNoDigit() {
        assertFalse(PasswordValidator.isValid("Password"));
    }

    @Test
    public void testNullPassword() {
        assertFalse(PasswordValidator.isValid(null));
    }
}

