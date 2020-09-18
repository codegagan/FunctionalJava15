package com.gagan.functional.demo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        // create Mutable hashmap
        final HashMap<Integer, String> map = new HashMap<>(Map.of(1, "one", 2, "two", 3, "three", 4, "four", 5, "five"));

        map.computeIfAbsent(6, k -> k.toString());
        System.out.println("map = " + map);

        // computeIfAbsent

        // computeIfPresent
        map.computeIfPresent(4, (oldVal, newVal) -> oldVal + newVal);

        System.out.println("map = " + map);

        // merge /upsert

        map.merge(2, "nine", (e, v) -> e+v);

        System.out.println("map = " + map);

        // print map

    }
}
