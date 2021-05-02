package com.company;

public class getSandwich {
    public static String run(String str) {
        if (str.indexOf("bread") != str.lastIndexOf("bread")) {
            return str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread"));
        }

        return "";
    }
}
