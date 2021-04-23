package com.company;

public class extraFront {
    public String run(String str) {
        if (str.length() < 2) {
            return str + str + str;
        }

        return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
    }
}
