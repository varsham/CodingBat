package com.company;

public class answerCell {
    public static boolean run(boolean isMorning, boolean isMom, boolean isAsleep) {
        return (isMorning && isMom && !isAsleep || (!isMorning && !isAsleep));
    }

}
