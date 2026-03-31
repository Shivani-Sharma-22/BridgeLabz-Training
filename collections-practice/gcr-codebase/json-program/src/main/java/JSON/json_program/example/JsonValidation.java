package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

public class JsonValidation {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            // JSON Schema
            String schemaJson = """
            {
              "type": "object",
              "properties": {
                "id": { "type": "integer" },
                "name": { "type": "string" },
                "age": { "type": "integer", "minimum": 18 },
                "email": { "type": "string", "format": "email" }
              },
              "required": ["id", "name", "email"]
            }
            """;
            // JSON Data
            String userJson = """
            {
              "id": 101,
              "name": "Kanhiya",
              "age": 26,
              "email": "kanhiya@gmail.com"
            }
            """;
            JsonNode schemaNode = mapper.readTree(schemaJson);
            JsonNode jsonNode = mapper.readTree(userJson);
            JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
            JsonSchema schema = factory.getJsonSchema(schemaNode);
            if (schema.validate(jsonNode).isSuccess()) {
                System.out.println("JSON is VALID");
            }
            else {
                System.out.println("JSON is INVALID");
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
