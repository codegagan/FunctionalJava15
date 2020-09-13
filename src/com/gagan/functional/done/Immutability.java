package com.gagan.functional.done;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Immutability {
    public static void main(String[] args) {
        final List<String> a = List.of("a");
//        a.add("");
        final Date date = new Date();
        final LocalDateTime now = LocalDateTime.now();
        final LocalDateTime dayBefore = now.minusDays(1);
        System.out.println(dayBefore);


        final int[] numbers = {1, 2, 3, 4, 5};
        doSomethingFromNumbers(numbers);


//        System.out.println(Arrays.toString(numbers));

    }

    private static void doSomethingFromNumbers(int[] numbers) {
        numbers[3] = 77;
    }
}
