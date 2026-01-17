import java.util.*;

public class LinearSearchSentence {
    public static String findSentence(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // consume the newline
        String[] sentences = new String[n];
        for (int i = 0; i < n; i++) {
            sentences[i] = sc.nextLine();
        }

        String word = sc.nextLine();
        sc.close();

        String result = findSentence(sentences, word);
        System.out.println(result);
    }
}
