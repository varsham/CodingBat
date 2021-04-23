package com.company;

public class lastChars {
    public static String lastChars(String a, String b) {
        String aStr = "@";
        String bStr = "@";
        if (a.length() > 0) {
            aStr = a.substring(0, 1);
        }

        if (b.length() > 0) {
            bStr = b.substring(b.length() - 1);
        }

        return aStr + bStr;
    }
}
