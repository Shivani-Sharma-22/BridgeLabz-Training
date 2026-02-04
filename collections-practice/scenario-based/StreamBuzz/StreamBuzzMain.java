package StreamBuzz;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Scanner;

public class StreamBuzzMain {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        while (true) {
            System.out.println("1. Register Creator");
            System.out.println("2. Show Top Posts");
            System.out.println("3. Calculate Average Likes");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            int choice = myScan.nextInt();
            myScan.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter Creator Name : ");
                    String name = myScan.nextLine();

                    double[] likes = new double[4];
                    System.out.println("Enter weekly likes (Week 1 to 4) : ");

                    for (int i = 0; i < 4; i++) {
                        likes[i] = myScan.nextDouble();
                    }
                    myScan.nextLine();

                    CreatorStats creator = new CreatorStats(name, likes);
                    CreatorStats.registerCreator(creator);

                    System.out.println("Creator registered successfully");
                    break;

                case 2:
                    System.out.println("Enter like threshold : ");
                    double threshold = myScan.nextDouble();

                    Dictionary<String, Integer> result =
                            CreatorStats.getTopPostCounts(CreatorStats.engagementBoard, threshold);

                    if (result.size() == 0) {
                        System.out.println("No top-performing posts this week");
                    } else {
                        Enumeration<String> keys = result.keys();
                        while (keys.hasMoreElements()) {
                            String key = keys.nextElement();
                            System.out.println(key + " - " + result.get(key));
                        }
                    }
                    break;

                case 3:
                    double avg = CreatorStats.calculateAverageLikes();
                    System.out.println("Overall average weekly likes : " + avg);
                    break;

                case 4:
                    System.out.println("Logging off");
                    return;

                default:
                    break;
            }
        }
    }
}