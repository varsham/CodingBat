package com.company;

public class withoutDoubles {
    public static int run(int die1, int die2, boolean noDoubles) {
        if (noDoubles && (die1 == die2)) {
            if (die1 == 6) {
                return 1 + die2;
            } else {
                return die1 + die2 + 1;
            }
        } else if (!noDoubles && (die1 == die2)) {
            return die1 + die2;
        }

        return die1 + die2;

    }

}
