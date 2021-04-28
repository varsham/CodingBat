package com.company;

public class lastDigit {
    public static boolean run (int a, int b, int c) {
        a %= 10;
        b %= 10;
        c %= 10;

        return (a == b || a == c || b == c);
    }

}
