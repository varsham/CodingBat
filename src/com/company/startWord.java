package com.company;

public class startWord {
    public String startWord(String str, String word) {
        if (str.length() == 0) {
            return "";
        }

        if (word.length() == 1) {
            return str.substring(0, 1);
        }

        if (str.indexOf(word.substring(1)) == 1) {
            return str.substring(0, word.length());
        } else {
            return "";
        }
    }
}
