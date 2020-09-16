package com.gagan.functional.done;

public class RecordType {
    public static void main(String[] args) {
        record Touple(int a, String b) { }
        final Touple demo = new Touple(3, "demo");
        System.out.println("demo = " + demo);
    }
}
