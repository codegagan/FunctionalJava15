package com.gagan.functional.done;

public class SwitchExpression {
    public static void main(String[] args) {
        int a = 5;
        int b = -1;

        switch (a) {
            case 1:
            case 2:
            case 3: b =3;break;
            case 5: b =5;break;
            default: b=10;
        }

        System.out.println(switch (a){
            case 1,2,3 -> 3;
            case 5 -> " hello";
            default -> 10;
        });

        System.out.println("b = " + b);

        // todo Check in JEP

//        var c = switch (a){
//            case 1,2,3 -> 6;
//            case 5 -> "Hello";
//            default -> "world";
//        };
//
//        System.out.println("c = " + c.getClass());
//
//        var d = 10;
//        System.out.println("d = " + d);
//        d = "Hello";
//
//        c = 10;
//        System.out.println("c = " + c.getClass());

    }
}
