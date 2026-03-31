package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FilterJsonByAge {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String jsonArray = """
            [
              {"id":1,"name":"Kanhiya","age":26},
              {"id":2,"name":"Bhavy","age":23},
              {"id":3,"name":"Naman","age":28}
            ]
            """;

            JsonNode rootNode = mapper.readTree(jsonArray);
            for (JsonNode node : rootNode) {
                int age = node.get("age").asInt();
                if (age > 25) {
                    System.out.println(node.toPrettyString());
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
