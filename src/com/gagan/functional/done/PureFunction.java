package com.gagan.functional.done;

public class PureFunction {

    int factor = 5;
    int result = 0;

    public int add(int a, int b) {
        return a + b;
    }

    public int addFactor(int x) {
        return x * factor;
    }

    public void addToResult(int a, int b){
        result = a + b;
    }

    public static void main(String[] args) {
        final PureFunction pureFunction = new PureFunction();
    }
}
