package com.company;

public class blueTicket {
    public static int run(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        if (ab == 10 || bc == 10 || ac == 10) {
            return 10;
        } else if (ab == (10 + bc) || ab == (10 + ac)) {
            return 5;
        }

        return 0;
    }
}
