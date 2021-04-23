package com.company;

public class twoChar {
    public static String run(String str, int index) {
        if (index >= 0 && index <= str.length() - 2) {
            return str.substring(index, index + 2);
        }

        return str.substring(0, 2);

    }
}
