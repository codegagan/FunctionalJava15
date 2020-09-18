package com.gagan.functional.demo;

import java.util.function.Function;

public class HigherOrderDemo {
  // Write a function to combine two functions

    Function<Integer, Integer> combineTwoFunctions(Function<Integer, Integer> a, Function<Integer, Integer> b){
        return a.andThen(b);
    }



}
