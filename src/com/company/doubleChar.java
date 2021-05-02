package com.company;

public class doubleChar {
    public static String run(String str) {
        String r = "";
        for (int i = 0; i < str.length(); i++) {
            r += Character.toString(str.charAt(i)) + Character.toString(str.charAt(i));
        }

        return r;
    }
}
