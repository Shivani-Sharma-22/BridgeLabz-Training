package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class JsonToXml {
    public static void main(String[] args) {
        try {
            ObjectMapper jsonMapr = new ObjectMapper();
            XmlMapper xmlMapr = new XmlMapper();
            String json = """
            {
              "id": 101,
              "name": "Rahul",
              "age": 26,
              "email": "rahul@gmail.com"
            }
            """;

            JsonNode jsonNode = jsonMapr.readTree(json);
            String xml = xmlMapr.writeValueAsString(jsonNode);
            System.out.println(xml);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
