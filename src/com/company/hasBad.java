package com.company;

public class hasBad {
    public static boolean hasBad(String str) {
        if (str.indexOf("bad") == 0 || str.indexOf("bad") == 1) {
            return true;
        }

        return false;
    }
}
