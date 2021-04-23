package com.company;

public class bunnyEars2 {
    public static int run(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else if (bunnies % 2 == 0) {
            return 3 + run(bunnies - 1);
        } else {
            return 2 + run(bunnies - 1);
        }
    }
}
