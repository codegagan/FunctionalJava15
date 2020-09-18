package com.gagan.functional.demo;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        // Refer to static variable
        final Double staticDoubleValue = MyClass.staticDoubleValue;

        // Refer to static method
        final Function<String, Integer> doStaticOperation = MyClass::doStaticOperation;

        // refer to instance method.
        final MyClass myClass = new MyClass();
        final Function<String, Long> instanceMethod = myClass::instanceMethod;

        // refer to constructor

        final Supplier<MyClass> aNew = MyClass::new;
        final MyClass myClass1 = aNew.get();

    }
}


class MyClass{

    static final Double staticDoubleValue = 5.5d;

    static Integer doStaticOperation(String input){
        return Integer.valueOf(input);
    }

    Long instanceMethod(String input){
        return Long.valueOf(input);
    }
}