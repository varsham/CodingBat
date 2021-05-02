package com.company;

public class repeatEnd {
    public static String run(String str, int n) {
        String r = "";
        for (int i = 0; i < n; i++) {
            r += str.substring(str.length() - n);
        }

        return r;
    }
}
