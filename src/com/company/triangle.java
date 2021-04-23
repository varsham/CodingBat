package com.company;

public class triangle {
    public static int run(int rows) {
        if (rows == 0) {
            return 0;
        } else {
            return rows + run(rows - 1);
        }
    }
}
