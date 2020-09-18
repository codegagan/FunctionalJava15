package com.gagan.functional.demo;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfDemo {
    public static void main(String[] args) {
        // Create mutable list
        final ArrayList<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        integers.removeIf(i -> i >5);
        System.out.println("integers = " + integers);

        // remove elements with predicate

        // print
    }
}
