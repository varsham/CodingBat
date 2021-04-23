package com.company;

public class makeEnds {
    public int[] makeEnds(int[] nums) {
        int[] copy = new int[2];

        copy[0] = nums[0];
        copy[1] = nums[nums.length - 1];

        return copy;
    }
}
