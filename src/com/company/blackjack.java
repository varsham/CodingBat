package com.company;

public class blackjack {
    public static int blackjack (int a, int b) {
        if (a > 21 && b > 21) {
            return 0;
        } else if (a > 21) {
            return b;
        } else if (b > 21) {
            return a;
        } else if (Math.abs(21 - a) < Math.abs(21 - b)) {
            return a;
        } else {
            return b;
        }
    }
}
