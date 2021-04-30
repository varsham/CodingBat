package com.company;

public class roundSum {
    public static int run(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public static int round10(int n) {
        if (n % 10 >= 5) {
            n += 10 - (n % 10);
        } else if (n % 10 < 5) {
            n -= (n % 10);
        }

        return n;
    }
}


