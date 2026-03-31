import java.util.*;

public class VotingSystem {

    public static void main(String[] args) {

        Map<String, Integer> votes = new HashMap<>();
        Map<String, Integer> insertionOrder = new LinkedHashMap<>();
        TreeMap<String, Integer> sortedResult;

        castVote(votes, insertionOrder, "Shivani");
        castVote(votes, insertionOrder, "Uttkarsh");
        castVote(votes, insertionOrder, "Dev");
        castVote(votes, insertionOrder, "Amit");

        System.out.println("Vote Count: " + votes);

        sortedResult = new TreeMap<>(votes);
        System.out.println("Sorted Result: " + sortedResult);

        System.out.println("Insertion Order: " + insertionOrder);
    }

    static void castVote(Map<String, Integer> votes,
                          Map<String, Integer> insertionOrder,
                          String candidate) {

        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        insertionOrder.put(candidate, votes.get(candidate));
    }
}

