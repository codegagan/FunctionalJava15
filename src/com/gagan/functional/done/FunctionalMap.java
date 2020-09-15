package com.gagan.functional.done;

import java.util.HashMap;
import java.util.Map;

public class FunctionalMap {
    public static void main(String[] args) {
        final HashMap<Integer, String> map = new HashMap<>(Map.of(1, "one", 2, "two", 3, "three", 4, "four", 5, "five"));
        // Get the value from db if not present in hashmap.
        map.computeIfAbsent(1, FunctionalMap::getFromDb);

        // If value present,
        map.computeIfPresent(4, FunctionalMap::computeForExistingValue);

        // like an upsert, concatenate values if
        map.merge(10, "ten", FunctionalMap::mergeValues);

        System.out.println(map);
    }

    private static String getFromDb(Integer x) {
        System.out.println("FunctionalMap.getFromDb");
        return "eleven";
    }

    private static String computeForExistingValue(Integer key, String value) {
        System.out.println("FunctionalMap.computeForExistingValue");
        return key + value;
    }

    private static String mergeValues(String oldValue, String newValue) {
        System.out.println("FunctionalMap.mergeValues");
        return oldValue + newValue;
    }
}
