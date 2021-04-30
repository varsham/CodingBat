package com.company;

public class closeFar {
    public static boolean closeFar(int a, int b, int c) {
        int ba = Math.abs(b - a);
        int ca = Math.abs(c - a);
        int cb = Math.abs(c - b);

        if ((ba <= 1 && ca >= 2 && cb >= 2) || (ba >= 2 && ca <= 1 && cb >= 2)) {
            return true;
        }

        return false;
    }
}
