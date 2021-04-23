package com.company;

public class deFront {
    public static String run(String str) {
        String r = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.charAt(i) == 'a') {
                r += str.substring(0, 1);
            } else if (i == 1 && str.charAt(i) == 'b') {
                r += str.substring(1, 2);
            } else if (i >= 2) {
                char c = str.charAt(i);
                r += Character.toString(c);
            }
        }

        return r;
    }
}
