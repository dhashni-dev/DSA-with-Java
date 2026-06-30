/*
Problem: Search Insert Position

Approach:
Traversed the sorted array from left to right.
Returned the first index where nums[i] was greater than or equal to the target.
If no such index was found, returned nums.length.
*/
class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++){
            if(nums[i] >= target){
               return i;
            }
        }
    }
}
