import java.util.*;

public class EventWelcomeMessage {
    public static void main(String[] args) {

        List<String> attendees = List.of(
            "Shivani", "Amit", "Riya", "Rahul"
        );

        attendees.forEach(name ->
            System.out.println("Welcome to the event, " + name + "!")
        );
    }
}
