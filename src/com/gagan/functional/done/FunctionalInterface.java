package com.gagan.functional.done;

import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {
        final Supplier<String> stringSupplier = () -> "from supplier";
        final Supplier<String> stringSupplier1 = String::new;

        final Consumer<String> stringConsumer = x -> System.out.println(x);

        final Function<Integer, Integer> multiplyBy5 = x -> x*5;

        final Predicate<String> stringPredicate = x -> x.isBlank();

        final BiConsumer<String, Integer> biConsumer = (x, y) -> System.out.println(x + y);

        final BiFunction<String, String, Integer> biFunction = (x, y) -> (x+y).length();

        // ...
    }
}
