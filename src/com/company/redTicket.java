package com.company;

public class redTicket {
    public static int run(int a, int b, int c) {
        if (a == b && b == c && a == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (b != a && c != a) {
            return 1;
        }

        return 0;
    }
}
