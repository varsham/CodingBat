package com.company;

public class xyBalance {
    public static boolean run(String str) {
        return (str.lastIndexOf('x') < str.lastIndexOf('y') || (!str.contains("y") && !str.contains("x")));
    }
}
