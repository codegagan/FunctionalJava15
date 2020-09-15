package com.gagan.functional.done;


import java.util.stream.Stream;

public class ForEach {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,8,9)
                .forEach(System.out::println);
    }
}
