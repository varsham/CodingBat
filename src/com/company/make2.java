package com.company;

public class make2 {
    public static int[] make2(int[] a, int[] b) {
        int[] total = new int[a.length + b.length];
        int i;
        for (i = 0; i < a.length; i++) {
            total[i] = a[i];
        }

        int count = 0;
        for (int j = i; j < b.length + i; j++) {
            total[j] = b[count];
            count++;
        }

        int[] copy = new int[2];
        copy[0] = total[0];
        copy[1] = total[1];

        return copy;
    }
}
