package com.company;

public class sumLimit {
    public static int run(int a, int b) {
        if (String.valueOf(a + b).length() > String.valueOf(a).length()) {
            return a;
        }

        return a + b;
    }
}
