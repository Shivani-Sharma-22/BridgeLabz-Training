import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {

        int maxLimit = 10;

        Function<String, Integer> getLength =
                str -> str.length();

        String message = "Hello Functional Interface";

        int length = getLength.apply(message);

        if (length > maxLimit) {
            System.out.println(" Message exceeds character limit");
        } else {
            System.out.println(" Message is within limit");
        }
    }
}
