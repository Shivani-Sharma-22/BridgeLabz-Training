package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJsonObject {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json1 = "{ \"name\": \"Kanhiya\", \"age\": 26 }";
            String json2 = "{ \"email\": \"kanhiya@gmail.com\", \"city\": \"Delhi\" }";

            JsonNode node1 = mapper.readTree(json1);
            JsonNode node2 = mapper.readTree(json2);

            ObjectNode mergingTwo = mapper.createObjectNode();
            mergingTwo.setAll((ObjectNode) node1);
            mergingTwo.setAll((ObjectNode) node2);

            System.out.println(mergingTwo.toPrettyString());

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
