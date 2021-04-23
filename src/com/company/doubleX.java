package com.company;

public class doubleX {
    public static boolean run(String str) {
        int index = str.indexOf("x");
        if (index >= 0 && index < str.length() - 1) {
            if (str.charAt(index + 1) == 'x') {
                return true;
            }
        }

        return false;
    }
}
