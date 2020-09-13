package com.gagan.functional.done;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReference {
    public static void main(String[] args) {
        final Double staticDoubleValue = MyClass.staticDoubleValue;

        final Function<String, Integer> doStaticOperation = MyClass::doStaticOperation;

        final MyClass myClass = new MyClass();
        final Function<String, Long> instanceMethod = myClass::instanceMethod;
        final Supplier<MyClass> constructor = MyClass::new;
        final MyClass myObj = constructor.get();
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