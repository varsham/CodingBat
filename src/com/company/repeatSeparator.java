package com.company;

public class repeatSeparator {
    public static String run(String word, String sep, int count) {
        String r = "";
        for (int i = 0; i < count; i++) {
            r += word;
            if (i != count - 1) {
                r += sep;
            }
        }

        return r;
    }
}
