package com.gagan.functional.demo;

import java.util.Optional;

public class FunctionalOptionalDemo {
    public static void main(String[] args) {
        // Create String optional
        final String someString = Optional.ofNullable((String) null)
                .filter(s -> s.length() > 5)
                .map(s -> s + "1")
                .orElseThrow(() -> new IllegalArgumentException("some error"));

        System.out.println("someString = " + someString);


        // filter by length

        // map to length int

        // orElseGet


        // ifpresent call a function

        //orElseThrow


    }
}
