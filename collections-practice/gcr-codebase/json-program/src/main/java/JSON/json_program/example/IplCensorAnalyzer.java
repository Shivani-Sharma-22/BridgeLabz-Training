package org.example;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.csv.*;

import java.io.File;
import java.util.*;

public class IplCensorAnalyzer {

    // ---------- CENSOR RULES (NULL-SAFE) ----------
    private static String maskTeam(String team) {
        if (team == null || team.trim().isEmpty()) {
            return "***";
        }

        int idx = team.lastIndexOf(" ");
        if (idx == -1) {
            return "***";
        }

        return team.substring(0, idx) + " ***";
    }

    private static String redactPlayer() {
        return "REDACTED";
    }

    // ---------- JSON PROCESSING ----------
    private static void processJson() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            File inputJson = new File("src/main/java/org/example/ipl.json");
            File outputJson = new File("src/main/java/org/example/ipl_censored.json");
            ArrayNode matches = (ArrayNode) mapper.readTree(inputJson);
            for (JsonNode match : matches) {
                ObjectNode obj = (ObjectNode) match;
                obj.put("team1", maskTeam(obj.path("team1").asText(null)));
                obj.put("team2", maskTeam(obj.path("team2").asText(null)));
                obj.put("winner", maskTeam(obj.path("winner").asText(null)));
                obj.put("player_of_match", redactPlayer());
            }
            mapper.writerWithDefaultPrettyPrinter().writeValue(outputJson, matches);
            System.out.println("JSON Censorship Done");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ---------- CSV PROCESSING ----------
    private static void processCsv() {
        try {
            CsvMapper csvMapper = new CsvMapper();
            File inputCsv = new File("src/main/java/org/example/ipl.csv");
            File outputCsv = new File("src/main/java/org/example/ipl_censored.csv");
            CsvSchema readSchema = CsvSchema.emptySchema().withHeader();
            MappingIterator<Map<String, String>> iterator =
                    csvMapper.readerFor(Map.class).with(readSchema).readValues(inputCsv);
            List<Map<String, String>> rows = iterator.readAll();

            for (Map<String, String> row : rows) {
                row.put("team1", maskTeam(row.getOrDefault("team1", "")));
                row.put("team2", maskTeam(row.getOrDefault("team2", "")));
                row.put("winner", maskTeam(row.getOrDefault("winner", "")));
                row.put("player_of_match", redactPlayer());
            }

            CsvSchema writeSchema = CsvSchema.builder()
                    .addColumn("match_id")
                    .addColumn("team1")
                    .addColumn("team2")
                    .addColumn("score_team1")
                    .addColumn("score_team2")
                    .addColumn("winner")
                    .addColumn("player_of_match")
                    .build()
                    .withHeader();

            csvMapper.writer(writeSchema).writeValue(outputCsv, rows);
            System.out.println("CSV Censorship Done");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ---------- MAIN ----------
    public static void main(String[] args) {
        processJson();
        processCsv();
    }
}
