package Annotation;

import java.lang.annotation.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult { }

class Calculator {
    static Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    int square(int x) {
        if (cache.containsKey(x)) {
            return cache.get(x);
        }
        int r = x * x;
        cache.put(x, r);
        return r;
    }
}

public class CustomCashingSystem {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.square(4)); // calculates & caches
        System.out.println(calc.square(4)); // returns from cache
    }
}
