package com.bridgelabz.junit_demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class FileProcessorTest {

    FileProcessor processor = new FileProcessor();
    String filename = "testfile.txt";

    @AfterEach
    void cleanup() {
        new File(filename).delete();
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        processor.writeToFile(filename, "Hello JUnit");
        String result = processor.readFromFile(filename);
        assertEquals("Hello JUnit", result);
    }

    @Test
    void testFileExistsAfterWrite() throws IOException {
        processor.writeToFile(filename, "Test Data");
        File file = new File(filename);
        assertTrue(file.exists());
    }

    @Test
    void testReadFileNotFoundException() {
        assertThrows(IOException.class, () -> {
            processor.readFromFile("nofile.txt");
        });
    }
}
