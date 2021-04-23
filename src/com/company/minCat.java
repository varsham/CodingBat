package com.company;

public class minCat {
    public static String minCat(String a, String b) {
        String newA = "", newB = "";
        if (a.length() == 0 || b.length() == 0) {
            return "";
        }

        if (a.length() > b.length()) {
            newA = a.substring(a.length() - b.length());
        } else {
            newA = a;
        }

        if (b.length() > a.length()) {
            newB = b.substring(b.length() - a.length());
        } else {
            newB = b;
        }

        if (newA.charAt(newA.length() - 1) == newB.charAt(0)) {
            return newA.substring(0, newA.length() - 1) + newB;
        } else {
            return newA + newB;
        }
    }
}
