package com.company;

public class reverse3 {
    public static int[] reverse3(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[2];
        nums[2] = temp;

        return nums;
    }
}
