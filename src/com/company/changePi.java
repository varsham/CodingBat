package com.company;

public class changePi {
    public static String changePi (String str) {
        if (str.length() == 2) {
            return str;
        }

        if (str.charAt(0) == 'p' && str.charAt(1) == 'p') {
            return "3.14" + changePi(str.substring(2));
        }

        return Character.toString(str.charAt(0)) + Character.toString(str.charAt(1)) + changePi(str.substring(2));
    }
}
