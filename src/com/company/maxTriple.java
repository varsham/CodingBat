package com.company;

public class maxTriple {
    public int maxTriple(int[] nums) {
        int midIndex = nums[nums.length / 2 - 1];
        int lowIndex = nums[0];
        int highIndex = nums[nums.length - 1];

        int max = midIndex;
        if (lowIndex > max) {
            max = lowIndex;
        }

        if (highIndex > max) {
            max = highIndex;
        }

        return max;
    }

}
