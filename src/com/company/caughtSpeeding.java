package com.company;

public class caughtSpeeding {
    public static int run(int speed, boolean isBirthday) {
        if (!isBirthday) {
            if (speed <= 60) {
                return 0;
            } else if (speed >= 61 && speed <= 80) {
                return 1;
            }

            return 2;
        }

        if (speed <= 65) {
            return 0;
        } else if (speed >= 66 && speed <= 85) {
            return 1;
        }

        return 2;
    }
}
