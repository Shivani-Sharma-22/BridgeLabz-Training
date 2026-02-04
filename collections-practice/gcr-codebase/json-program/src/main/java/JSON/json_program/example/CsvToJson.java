package org.example;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.util.*;

public class CsvToJson {
    public static void main(String[] args) {
        try {
            CsvMapper csvMapper = new CsvMapper();
            CsvSchema schema = CsvSchema.emptySchema().withHeader();
            MappingIterator<Map<String, String>> it = csvMapper.readerFor(Map.class).with(schema)
                            .readValues(new File("src/main/java/org/example/users.csv"));

            List<Map<String, String>> rowsList = it.readAll();
            ObjectMapper jsonMapper = new ObjectMapper();
            String json = jsonMapper.writeValueAsString(rowsList);
            System.out.println(json);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
