package com.company;

public class evenlySpaced {
    public static boolean run(int a, int b, int c) {
        int[] arr = {a, b, c};
        arr[0] = Math.min(arr[0], arr[2]);
        arr[1] = Math.max(arr[0], arr[2]);
        arr[0] = Math.min(arr[0], arr[1]);
        arr[1] = Math.max(arr[0], arr[1]);
        arr[2] = Math.max(arr[1], arr[2]);
        arr[1] = Math.min(arr[1], arr[2]);

        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
        return true;
    }
}
