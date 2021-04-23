package com.company;

public class frontPiece {
    public int[] frontPiece(int[] nums) {
        int[] copy = new int[2];
        if (nums.length == 0) {
            int[] empty = new int[0];
            return empty;
        } else if (nums.length == 1) {
            int[] empty = {nums[0]};
            return empty;
        }

        for (int i = 0; i < 2; i++) {
            copy[i] = nums[i];
        }

        return copy;
    }

}
