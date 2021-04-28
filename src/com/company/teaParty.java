package com.company;

public class teaParty {
    public static int run(int tea, int candy) {
        if (tea >= candy * 2 && candy >= 5) {
            return 2;
        } else if (candy >= tea * 2 && tea >= 5) {
            return 2;
        } else if (tea >= 5 && candy >= 5) {
            return 1;
        }

        return 0;
    }

}
