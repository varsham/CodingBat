package com.company;

public class stringSplosion {
    public static String run(String str) {
        String r = "";
        for (int i = 0; i < str.length(); i++) {
            r += str.substring(0, i + 1);
        }

        return r;
    }
}
