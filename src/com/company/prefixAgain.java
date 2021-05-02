package com.company;

public class prefixAgain {
    public static boolean run(String str, int n) {
        return (str.lastIndexOf(str.substring(0, n)) != 0);
    }
}
