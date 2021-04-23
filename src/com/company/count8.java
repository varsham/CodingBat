package com.company;

public class count8 {
    public static int run(int n) {
        int count = 0;
        int temp = n % 10;
        if (temp == 8) {
            count++;
        } else if (temp == 8 && temp % 10 == 8) {

        } else if (n / 10 == 0) {
            return count;
        }
        return count + run(n / 10);
    }
}
