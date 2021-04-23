package com.company;

public class seeColor {
    public static String run(String str) {
        if (str.indexOf("red") == 0) {
            return "red";
        } else if (str.indexOf("blue") == 0) {
            return "blue";
        } else {
            return "";
        }
    }
}
