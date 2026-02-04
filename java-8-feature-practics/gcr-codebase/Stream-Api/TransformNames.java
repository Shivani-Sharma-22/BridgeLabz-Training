import java.util.*;

public class TransformNames {
    public static void main(String[] args) {

        List<String> customerNames =
            List.of("shivani", "aman", "rahul", "neha");

        customerNames.stream()
                     .map(String::toUpperCase)
                     .sorted()
                     .forEach(System.out::println);
    }
}
