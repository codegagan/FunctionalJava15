package com.gagan.functional.demo;

import java.util.stream.Stream;

public class FunctionalStreamDemo {
    public static void main(String[] args) {
        // Infinite stream of integers
        final String reducedString = Stream.iterate(1, i -> i + 1)
                .map(i -> String.valueOf(i))
                .filter(s -> s.length() > 1)
                .limit(10)
                .reduce("", (s1, s2) -> s1 + "," + s2);

        System.out.println("reducedString = " + reducedString);

        // map to String

        // filter based on length

        // reduce, implement string concatenation


        System.out.println("Stream demo");
    }
}
