package com.company;

public class withouEnd2 {
    public static String run(String str) {
        if (str.length () < 2) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }
}
