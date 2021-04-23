package com.company;

public class makeMiddle {
    public int[] makeMiddle(int[] nums) {
        int mid = nums.length / 2 - 1;
        int[] copy = new int[2];
        int count = 0;
        for (int i = mid; i < mid + 2; i++) {
            copy[count] = nums[i];
            count++;
        }

        return copy;
    }

}
