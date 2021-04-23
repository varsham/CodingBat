package com.company;

public class without2 {
    public static String without2(String str) {
        if (str.length() == 2) {
            return "";
        } else if (str.length() == 1) {
            return str;
        } else if (str.length() == 0) {
            return "";
        }

        if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return str.substring(2);
        } else {
            return str;
        }
    }
}
