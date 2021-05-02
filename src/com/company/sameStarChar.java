package com.company;

public class sameStarChar {
    public static boolean run(String str) {
        boolean returnTrue = true;
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) == str.charAt(i + 1)) {
                    returnTrue = true;
                }

                returnTrue = false;
            }
        }
        return returnTrue;
    }
}
