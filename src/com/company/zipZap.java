package com.company;

public class zipZap {
    public static String run(String str) {
        String r = "";
        for (int i = 0; i < str.length() - 2; i++) {
            String s1 = Character.toString(str.charAt(i));
            String s2 = Character.toString(str.charAt(i + 2));
            r += s1;

            if (s1.equals("z") && s2.equals("p")) {
                r += s2;
            }
        }

        return r;
    }
}
