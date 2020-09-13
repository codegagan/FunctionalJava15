package com.gagan.functional.done;

import java.util.stream.Stream;

public class FunctionalStream {
    public static void main(String[] args) {
        final String reducedString = Stream.iterate(1, x -> x + 1)
                .map(x -> String.valueOf(x))
                .filter(y -> y.length() < 3)
                .limit(10)
                .reduce("0", (x, y) -> x + "," + y);

        System.out.println(reducedString);

        System.out.println("Stream demo");

    }
}
