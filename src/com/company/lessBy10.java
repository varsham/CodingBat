package com.company;

public class lessBy10 {
    public static boolean run(int a, int b, int c) {
        return (Math.abs(a - c) > 9 || Math.abs(b - c) > 9 || Math.abs(b - a) > 9);
    }

}
