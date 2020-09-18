package com.gagan.functional.demo;

import java.time.LocalDateTime;
import java.util.Date;

public class ImmutabilityDemo {
    public static void main(String[] args) {
        // See the Date instance methods
        final Date date = new Date();
        date.setTime(234324);

        // See LocalDate instance methods
        final LocalDateTime now = LocalDateTime.now();
        final LocalDateTime fourDaysBack = now.minusDays(4);


        // array of integers passed to some method
        final int[] numbers = {1, 2, 3, 4, 5};
        doSomething(numbers);
        System.out.println("numbers = " + numbers);

    }

    private static void doSomething(int[] numbers) {
        numbers[2]= 88;
    }
}
