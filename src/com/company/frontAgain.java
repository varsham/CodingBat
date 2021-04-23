package com.company;

public class frontAgain {
    public static boolean frontAgain(String str) {
        if (str.length() == 1) {
            return false;
        }
        return (str.substring(0, 2).equals(str.substring(str.length() - 2)));
    }
}
