package com.company;

public class xyzThere {
    public static boolean run(String str) {
        if (str.indexOf("xyz") == 0) {
            return true;
        }
        for (int i = 1; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("xyz") && str.charAt(i - 1) != '.') {
                return true;
            }
        }

        return false;
    }
}
