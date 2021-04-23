package com.company;

public class makeLast {
    public int[] makeLast(int[] nums) {
        int[] copy = new int[nums.length * 2];
        copy[copy.length - 1] = nums[nums.length - 1];

        return copy;
    }
}
