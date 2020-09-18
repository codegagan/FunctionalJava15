package com.gagan.functional.demo;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalPatternDemo {
    public static void main(String[] args) {
        System.out.println(getCondidtionalNumbers(i -> i%10 ==0));
//        System.out.println(getCondidtionalNumbersTen());
    }

    public static String getCondidtionalNumbers(Predicate<Integer> condition){
        final String collect = IntStream.rangeClosed(1, 100)
                .filter(condition::test)
                .mapToObj(i -> String.valueOf(i))
                .collect(Collectors.joining(","));
        return collect;
    }


}
