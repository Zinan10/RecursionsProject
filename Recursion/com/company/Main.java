package com.company;


public class Main {

    public static void main(String[] args) {

        System.out.println(Fibonacci.fRecursion(10));
        System.out.println("The factorial for the number entered is " + Factorial.factormult(10));
        headAndTailRecursion.tail(9);
        headAndTailRecursion.head(12);
        Iterative.test(7);
    }
}
