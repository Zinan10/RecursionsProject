package com.company;

public class Iterative {

    public static void test(int x) {
        // n is the number whose factorial is to be calculated

        int multiply = 1;
        for (int i = x; i >= 1; i--) {
            multiply = multiply * i;
            System.out.println(multiply);

        }

    }
}