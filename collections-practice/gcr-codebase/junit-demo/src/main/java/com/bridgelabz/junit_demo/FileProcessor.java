package com.bridgelabz.junit_demo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileProcessor {

    public void writeToFile(String filename, String content) throws IOException {
        Files.write(Paths.get(filename), content.getBytes());
    }

    public String readFromFile(String filename) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filename)));
    }
}
