package com.company;

public class makeBricks {
    public static boolean run(int small, int big, int goal) {
        if (small + (big * 5) == goal) {
            return true;
        } else if (big * 5 == goal) {
            return true;
        } else if (small + (big * 5) < goal) {
            return false;
        } else {
            if (goal > (big * 5) && (goal - (big * 5)) <= small) {
                return true;
            } else if (goal < (big * 5)) {
                int remain = (goal % 5);
                if (goal / 5 <= big && remain <= small) {
                    return true;
                } else {
                    return false;
                }

            } else {
                return false;
            }
        }
    }
}