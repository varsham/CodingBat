package com.company;

public class alarmClock {
    public static String alarmClock(int day, boolean vacation) {
        // weekends: 1, 6
        String r = "";

        if ((day == 0 || day == 6) && (!vacation)) {
            r = "10:00";
        } else if ((day == 0 || day == 6) && (vacation)) {
            r = "off";
        } else if ((day != 0 && day != 6) && (!vacation)) {
            r = "7:00";
        } else {
            r = "10:00";
        }

        return r;
    }
}
