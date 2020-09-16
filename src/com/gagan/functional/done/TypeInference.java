package com.gagan.functional.done;

import java.util.List;
import java.util.Map;

public class TypeInference {
    public static void main(String[] args) {

//        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().filter(x -> x.intValue())

        var integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        var map = Map.of(1, "one", 2, "two", 3, "three", 4, "four", 5, "five");

        for (var e : map.entrySet()) {
            System.out.println("e = " + e);
        }
    }
}
