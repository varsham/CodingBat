package com.company;

public class sumDigits {
    public static int run(int n) {
        if (n < 10) {
            return n;
        } else {
            return (n % 10) + run(n /= 10);
        }
    }
}
