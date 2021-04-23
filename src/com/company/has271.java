package com.company;

public class has271 {
    public static boolean run(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int val1 = Math.abs(nums[i + 1] - nums[i]);
            int val2 = Math.abs(nums[i + 1] - nums[i + 2]);

            if (val1 == 5 && val2 < 2) {
                return true;
            }
        }

        return false;
    }
}
