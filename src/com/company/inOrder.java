package com.company;

public class inOrder {
    public static boolean run(int a, int b, int c, boolean bOk) {
        if (bOk) {
            return (c > b);
        }

        return (b > a && c > b);
    }

}
