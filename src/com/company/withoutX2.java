package com.company;

public class withoutX2 {
    public static String withoutX(String str) {
        String r = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((i == 0 && c == 'x') || (i == 1 && c == 'x')) {
                continue;
            }

            r += Character.toString(c);
        }

        return r;
    }
}
