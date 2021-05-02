package com.company;

public class repeatFront {
    public static String run(String str, int n) {
        String r = "";
        for (int i = n; i >= 0; i--) {
            r += str.substring(0, i);
        }

        return r;
    }
}
