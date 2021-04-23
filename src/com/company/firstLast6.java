package com.company;

public class firstLast6 {
    public static boolean run(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        }

        return false;
    }
}
