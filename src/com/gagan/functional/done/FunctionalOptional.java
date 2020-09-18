package com.gagan.functional.done;

import java.util.Optional;

public class FunctionalOptional {
    public static void main(String[] args) {
        System.out.println(Optional.of("hello")
                .filter(s -> s.length() > 3)
                .map(s -> s.length())
                .orElseGet(() -> -5));

        Optional.of(5).ifPresent(FunctionalOptional::myFunction);

        System.out.println(Optional.of("hello")
                .filter(s -> s.length() > 6)
                .map(s -> s.length())
                .orElseThrow(() -> new IllegalArgumentException("arg issue")));
    }

    private static void myFunction(Object o) {
        System.out.println("o = " + o);
        System.out.println("FunctionalOptional.myFunction");
    }
}
