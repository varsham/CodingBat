package com.company;

public class countX {
    public static int run(String str) {
        if(str.length() == 0)
            return 0;

        if(str.charAt(0) == 'x')
            return 1 + run(str.substring(1));

        return run(str.substring(1));
    }
}
