package com.company;

public class midThree {
    public int[] midThree(int[] nums) {
        int[] copy = new int[3];

        int mid = nums.length / 2;

        copy[0] = nums[mid - 1];
        copy[1] = nums[mid];
        copy[2] = nums[mid + 1];

        return copy;
    }

}
