package com.company;

public class double23 {
    public boolean double23(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return false;
        }

        return ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3));
    }

}
