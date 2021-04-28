package com.company;

public class inOrderEqual {
    public static boolean run (int a, int b, int c, boolean equalOk) {
        if (equalOk) {
            return (c >= b && b >= a);
        }

        return (c > b && b > a);
    }

}
