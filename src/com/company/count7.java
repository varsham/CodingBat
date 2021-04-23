package com.company;

public class count7 {
    public static int run(int n) {
        int counter = 0;
        if (n % 10 == 7) {
            counter++;
        } else if (n / 10 == 0) {
            return counter;
        }
        return counter + run(n / 10);
    }
}
