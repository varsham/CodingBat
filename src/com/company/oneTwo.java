package com.company;

public class oneTwo {
    public static String run(String str) {
        String s = "";
        String[] strArray;
        if (str.length() % 3 != 0) {
            s = str.substring(0, (str.length() / 3) * 3);
            strArray = s.split("");
        } else {
            strArray = str.split("");
        }

        for (int i = 0; i < strArray.length; i++) {
            if (i % 3 == 2) {
                String temp = strArray[i - 2];
                strArray[i - 2] = strArray[i];
                strArray[i] = temp;

                temp = strArray[i - 1];
                strArray[i - 1] = strArray[i - 2];
                strArray[i - 2] = temp;
            }
        }
        String r = "";
        for (int i = 0; i < strArray.length; i++) {
            r += strArray[i];
        }

        return r;
    }
}
