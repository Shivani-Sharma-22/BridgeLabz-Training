package Collectors;

import java.util.*;
import java.util.stream.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "java is easy and java is powerful java is platform independent";
        Map<String,Integer> freq = Arrays.stream(text.split(" "))
                        .collect(Collectors.toMap(w -> w, w -> 1, Integer::sum));
        System.out.println(freq);
    }
}
