package com.company;

public class start1 {
    public int start1(int[] a, int[] b) {

        if (a.length == 0 && b.length != 0) {
            if (b[0] == 1) {
                return 1;
            } else {
                return 0;
            }
        } else if (a.length != 0 && b.length == 0) {
            if (a[0] == 1) {
                return 1;
            } else {
                return 0;
            }
        } else if (a.length == 0 && b.length == 0) {
            return 0;
        }
        if (a[0] == 1 && b[0] == 1) {
            return 2;
        } else if (a[0] != 1 && b[0] != 1) {
            return 0;
        } else {
            return 1;
        }
    }

}
