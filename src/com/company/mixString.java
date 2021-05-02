package com.company;

public class mixString {
    public String run(String a, String b) {
        int minLength = 0;
        String maxValue = "", r = "";
        if (a.length() < b.length()) {
            maxValue = b;
            minLength = a.length();
        } else {
            maxValue = a;
            minLength = b.length();
        }
        int i;
        for (i = 0; i < minLength; i++) {
            r += a.charAt(i);
            r += b.charAt(i);
        }

        r += maxValue.substring(i);

        return r;
    }
}
