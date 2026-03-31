package StreamBuzz;

import java.util.*;

public class CreatorStats {

    public String creatorName;
    public double[] weeklyLikes;

    public static List<CreatorStats> engagementBoard = new ArrayList<>();

    public CreatorStats(String creatorName, double[] weeklyLikes) {
        this.creatorName = creatorName;
        this.weeklyLikes = weeklyLikes;
    }

    public static void registerCreator(CreatorStats record) {
        engagementBoard.add(record);
    }

    public static Dictionary<String, Integer> getTopPostCounts(List<CreatorStats> records, double likeThreshold) {
        Dictionary<String, Integer> result = new Hashtable<>();
        for (CreatorStats creator : records) {
            int count = 0;
            for (double likes : creator.weeklyLikes) {
                if (likes >= likeThreshold) {
                    count++;
                }
            }
            if (count > 0) {
                result.put(creator.creatorName, count);
            }
        }
        return result;
    }

    public static double calculateAverageLikes() {
        double total = 0;
        int count = 0;
        for (CreatorStats creator : engagementBoard) {
            for (double likes : creator.weeklyLikes) {
                total += likes;
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return total / count;
    }
}