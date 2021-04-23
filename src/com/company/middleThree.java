package com.company;

public class middleThree {
    public static String run(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 2);
    }
}
