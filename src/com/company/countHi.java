package com.company;

public class countHi {
    public static int run(String str) {
        if(str.length() < 2)
            return 0;

        if(str.substring(0, 2).equals("hi"))
            return 1 + run(str.substring(2));

        return run(str.substring(1));
    }
}
