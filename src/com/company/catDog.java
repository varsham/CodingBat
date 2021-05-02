package com.company;

public class catDog {
    public static boolean run(String str) {
        int countC = 0, countD = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't') {
                countC++;
            } else if (str.charAt(i) == 'd' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'g') {
                countD++;
            }
        }

        return (countC == countD);
    }
}
