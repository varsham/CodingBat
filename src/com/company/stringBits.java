package com.company;

public class stringBits {
    public static String run(String str) {
        String r = "";
        int i = 0;
        while (i < str.length()) {
            char c = str.charAt(i);
            r += Character.toString(c);

            i += 2;
        }
        return r;
    }
}
