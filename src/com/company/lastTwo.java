package com.company;

public class lastTwo {
    public static String run(String str) {
        if (str.length() == 2) {
            return str.substring(1) + str.substring(0, 1);
        } else if (str.length() == 1 || str.length() == 0) {
            return str;
        }

        return str.substring(0, str.length() - 2) + str.substring(str.length() - 1) + str.substring(str.length() - 2, str.length() - 1);
    }
}
