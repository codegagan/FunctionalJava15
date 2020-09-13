package com.gagan.functional.done;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

public class Lambda {
    public static void main(String[] args) throws Exception {
        Closeable closeable = new Closeable() {
            @Override
            public void close() throws IOException {
                System.out.println("Closing io stuff");
            }
        };

        Closeable closeable1 = () -> System.out.println("Closing io stuff with lambda");

        closeable.close();
        closeable1.close();

        // Similar way other interfaces, which return something.

        Callable<String> callable = () -> "Value from a thread";

        System.out.println(Executors.newSingleThreadExecutor().submit(callable).get());

    }
}
