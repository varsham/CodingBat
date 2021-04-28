package com.company;

public class greenTicket {
    public static int run(int a, int b, int c) {
        if (a == b && b == c && a == c) {
            return 20;
        } else if (a != b && b != c && a != c) {
            return 0;
        }

        return 10;
    }
}
