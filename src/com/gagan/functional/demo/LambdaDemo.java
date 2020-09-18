package com.gagan.functional.demo;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.Callable;

public class LambdaDemo {
    public static void main(String[] args) throws IOException {
        // Implement closable interface
        Closeable closeable = () -> System.out.println("closing the stream");

        closeable.close();


        // replace with lambda


        // Implement callable interface with lambda.

        Callable<String> callable = () -> "String from callable";

    }
}
