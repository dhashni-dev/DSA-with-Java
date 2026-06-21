/*
Problem: Running Sum of 1D Array

Approach:
Added the previous running sum to the current element.
Updated the array in-place.

/*

class Solution {
    public int[] runningSum(int[] nums) {
        for(int i =1; i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }

        return nums;
    }
}  
