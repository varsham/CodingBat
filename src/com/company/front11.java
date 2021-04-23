package com.company;

public class front11 {
    public static int[] front11(int[] a, int[] b) {
        int[] copy2 = new int[2];
        if (a.length == 0 && b.length == 0) {
            int copy[] = new int[0];
            return copy;
        } else if (b.length == 0) {
            int copy[] = {a[0]};
            return copy;
        } else if (a.length == 0) {
            int copy[] = {b[0]};
            return copy;
        }

        copy2[0] = a[0];
        copy2[1] = b[0];

        return copy2;
    }
}
