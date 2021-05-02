package com.company;

public class endOther {
    public static boolean run(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() < b.length()) {
            return (b.substring(b.length() - a.length()).equals(a));
        } else if (a.length() > b.length()) {
            return (a.substring(a.length() - b.length()).equals(b));
        } else {
            return (a.equals(b));
        }
    }
}
