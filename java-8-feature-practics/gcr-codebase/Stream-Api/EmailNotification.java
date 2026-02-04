import java.util.*;

public class EmailNotification {
    public static void main(String[] args) {

        List<String> emails = List.of(
            "user1@gmail.com",
            "user2@gmail.com"
        );

        emails.forEach(email -> sendEmailNotification(email));
    }

    static void sendEmailNotification(String email) {
        System.out.println("Sending notification email to: " + email);
    }
}
