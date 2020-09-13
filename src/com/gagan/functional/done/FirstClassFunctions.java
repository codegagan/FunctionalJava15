package com.gagan.functional.done;

import java.util.function.Function;

public class FirstClassFunctions {
    public static void main(String[] args) {
        final long maxValue = Long.MAX_VALUE;
        final Function<String, Long> convertToLong = Long::valueOf;
        System.out.println(convertToLong.apply("1234"));
    }
}
