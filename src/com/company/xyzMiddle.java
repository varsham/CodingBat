package com.company;

public class xyzMiddle {
    public static boolean run(String str) {
        if (str.length() < 3) {
            return false;
        }
        String preStr = str.substring(0, str.indexOf("xyz"));
        String postStr = str.substring(str.indexOf("xyz") + 1);

        return (Math.abs(preStr.length() - postStr.length()) >= 1);
    }
}
