package com.company;

public class dateFashion {
    public static int run(int you, int date) {
        if ((you > 7 && date > 2) || (date > 7 && you > 2)) {
            return 2;
        } else if (you < 3 || date < 3) {
            return 0;
        } else {
            return 1;
        }
    }
}
