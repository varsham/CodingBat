package com.company;

public class rotateLeft3 {
    public static int[] rotateLeft(int[] nums) {
        int[] copy = new int[nums.length];

        copy[0] = nums[1];
        copy[1] = nums[2];
        copy[2] = nums[0];

        return copy;
    }
}
