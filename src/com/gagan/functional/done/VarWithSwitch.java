package com.gagan.functional.done;

public class VarWithSwitch {
    public static void main(String[] args) {

        var s = "aString";
//        s = 10; // Doesn't compile

        var switchReturn = switch (5){
            case 1,2,3 -> 6;
            case 5 -> "Hello";
            default -> "world";
        };

        System.out.println("switchReturn = " + switchReturn);
        System.out.println("switchReturn.getClass() = " + switchReturn.getClass());

        switchReturn = 20; // Different type of value.
        System.out.println("switchReturn = " + switchReturn);
        System.out.println("switchReturn.getClass() = " + switchReturn.getClass());

//        switchReturn = new Object(); // Doesn't compile
    }
}
