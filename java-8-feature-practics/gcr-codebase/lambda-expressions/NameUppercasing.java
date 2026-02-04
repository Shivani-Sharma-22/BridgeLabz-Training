package BridgeLabz_Day39_LambdaExpressions;

import java.util.*;

public class NameUppercasing {
    public static void main(String[] args) {
        List<String> empNames = Arrays.asList("kanhiya", "naman", "bhavy", "arsh", "akarsh");
        empNames.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
