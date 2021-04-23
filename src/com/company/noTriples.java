package com.company;

public class noTriples {
    public static boolean run(int[] nums) {
        boolean noTriples = true;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]) {
                noTriples = false;
            }
        }
        return noTriples;
    }
}
