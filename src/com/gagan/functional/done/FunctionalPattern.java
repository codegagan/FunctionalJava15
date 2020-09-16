package com.gagan.functional.done;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalPattern {
    public static void main(String[] args) {
        System.out.println(getNumbersDivisibleBy(i -> i%5 ==0));
        System.out.println(getNumbersDivisibleBy(x -> x%8 ==0));
    }

    public static String getNumbersDivisibleBy(Predicate<Integer> condition){
        return IntStream.rangeClosed(0, 100)
                .filter(condition::test)
                .mapToObj(i -> i + "")
                .collect(Collectors.joining(","));
    }

}
