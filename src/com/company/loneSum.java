package com.company;

public class loneSum {
    public static int run(int a, int b, int c) {
        int sum = a + b + c;
        if (a == b && b == c) {
            return 0;
        }
        if (a == b) {
            return sum - a - b;
        }
        if (b == c) {
            return sum - b - c;
        }
        if (a == c) {
            return sum - a - c;
        }

        return sum;
    }
}
