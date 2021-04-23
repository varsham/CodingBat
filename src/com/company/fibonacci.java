package com.company;

public class fibonacci {
    public static int run(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return run(n - 1) + run(n - 2);
        }
    }
}
