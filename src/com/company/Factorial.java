package com.company;

public class Factorial {
    public static int run(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * run(n - 1);
        }
    }
}
