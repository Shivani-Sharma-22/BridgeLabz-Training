package com.bridgelabz.junit_demo;

public class DatabaseConnection {

    private boolean connected = false;

    public void connect() {
        connected = true;
        System.out.println("Database Connected");
    }

    public void disconnect() {
        connected = false;
        System.out.println("Database Disconnected");
    }

    public boolean isConnected() {
        return connected;
    }
}
