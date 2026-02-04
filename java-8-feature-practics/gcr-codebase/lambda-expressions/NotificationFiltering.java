package BridgeLabz_Day39_LambdaExpressions;

import java.util.*;
import java.util.function.Predicate;

public class NotificationFiltering {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        List<Notification> alerts = Arrays.asList(
                new Notification("Heart rate critical", "Emergency"),
                new Notification("Appointment tomorrow", "Reminder"),
                new Notification("Blood report ready", "Report"),
                new Notification("Health tips", "General")
        );
        System.out.print("Enter alert type to view : ");
        String userChoice = myScan.nextLine();

        Predicate<Notification> filterByType =
                n -> n.type.equalsIgnoreCase(userChoice);

        alerts.stream()
                .filter(filterByType)
                .forEach(n -> System.out.println(n.message));
    }
}
