package com.company;

public class squirrelPlay {
    public static boolean run(int temp, boolean isSummer) {
        if (isSummer) {
            return (temp >= 60 && temp <= 100);
        }

        return (temp >= 60 && temp <= 90);
    }
}
