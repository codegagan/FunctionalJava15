package com.gagan.functional.done;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {
    public static void main(String[] args) {
        final ArrayList<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        integers.removeIf(x -> x > 5);
        System.out.println(integers);
    }

}
