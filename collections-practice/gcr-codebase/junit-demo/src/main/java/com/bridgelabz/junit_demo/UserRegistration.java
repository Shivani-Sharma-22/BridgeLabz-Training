package com.bridgelabz.junit_demo;

public class UserRegistration {

    /**
     * Registers a user with given username, email, and password.
     * Throws IllegalArgumentException if any input is invalid.
     */
    public static void registerUser(String username, String email, String password) {
        if (username == null || username.trim().length() < 3) {
            throw new IllegalArgumentException("Username must be at least 3 characters");
        }

        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Invalid email format");
        }

        if (!isValidPassword(password)) {
            throw new IllegalArgumentException("Password must be at least 8 characters, " +
                                               "contain at least one uppercase letter and one digit");
        }

        // If all checks pass, user is considered registered (you can add database logic here)
    }

    private static boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) return false;

        boolean hasUppercase = false;
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUppercase = true;
            if (Character.isDigit(c)) hasDigit = true;
        }

        return hasUppercase && hasDigit;
    }
}

