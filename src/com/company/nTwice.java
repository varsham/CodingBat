package com.company;

public class nTwice {
    public static String run(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }
}
