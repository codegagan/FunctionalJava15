package com.gagan.functional.done;

import java.util.function.Supplier;

public class Lazy {
    public static void main(String[] args) {
        doSomethingWithValues(4, getTheValue());
        doSomethingWithValues(4, () -> getTheValue());
    }

    private static int getTheValue() {
        System.out.println("getting the value");
        return 88;
    }

    private static void doSomethingWithValues(int i, int i1) {
        if(i > 5 ){
            System.out.println(i1);
        }
    }

    private static void doSomethingWithValues(int i, Supplier<Integer> value) {
        if(i > 5 ){
            System.out.println(value.get());
        }
    }

}
