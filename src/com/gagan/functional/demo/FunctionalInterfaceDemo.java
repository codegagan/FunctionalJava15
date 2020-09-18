package com.gagan.functional.demo;

import java.util.function.*;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        // Implement String supplier with lambda
        Supplier<String> stringSupplier = () -> "String from supplier";

        // Implement String consumer with lambda/method reference
        Consumer<String> stringConsumer = System.out::println;


        // Implement Function
        Function<Integer, String> intToStringFunction = x -> String.valueOf(x);

        // String predicate

        Predicate<String> predicate = s -> s.length() >5;

        // BiConsumer to concatenate two values and print

        BiConsumer<Integer, String> consumer1 =(i, s) -> System.out.println(i + s);

        // BiFunction to get the sum of length of two strings
    }
}
