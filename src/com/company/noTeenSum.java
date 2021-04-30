package com.company;

public class noTeenSum {
    public static int run(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public static int fixTeen(int n) {
        if (n >= 13 && n <= 19 && n != 15 && n != 16) {
            n = 0;
        }

        return n;
    }
}
