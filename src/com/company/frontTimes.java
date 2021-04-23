package com.company;

public class frontTimes {
    public static String frontTimes(String str, int n) {
        String r = "";
        if (str.length() < 3) {
            for (int i = 0; i < n; i++) {
                r += str;
            }

            return r;
        }

        for (int i = 0; i < n; i++) {
            r += str.substring(0, 3);
        }

        return r;
    }
}
