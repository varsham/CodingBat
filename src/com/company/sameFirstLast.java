package com.company;

public class sameFirstLast {
    public static boolean run(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        return (nums[0] == nums[nums.length - 1]);
    }
}
