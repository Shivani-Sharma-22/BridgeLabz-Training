import java.io.*;
import java.util.*;

public class WordCount {

    public static void main(String[] args) {

    	String fileName = "collections-practice/gcr-codebase/Stream/source.txt";
 

        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {

                line = line.toLowerCase().replaceAll("[^a-z ]", "");
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(wordCount.entrySet());

        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("Top 5 most frequent words:");
        for (int i = 0; i < Math.min(5, list.size()); i++) {
            System.out.println(list.get(i).getKey() + " : " + list.get(i).getValue());
        }
    }
}
