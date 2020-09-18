package com.gagan.functional.demo;

import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        // forEach over list and see consumer.
        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .stream()
                .forEach(System.out::println);

    }
}
