package com.company;

public class shareDigit {
    public static boolean run(int a, int b) {
        int a1 = a % 10;
        a /= 10;
        int a2 = a;

        int b1 = b % 10;
        b /= 10;
        int b2 = b;

        return (a1 == b1 || a1 == b2 || a2 == b1 || a2 == b2);
    }
}
