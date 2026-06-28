/*
Problem : Find PIvot Index
Approach :
Used nested loops to calculate left sum and right sum for each index.
Compared both sums and returned the pivot index.
*/
class Solution {
    public int pivotIndex(int[] nums) {
       for(int i = 0;i<nums.length;i++){
            int leftsum = 0;
            int rightsum = 0;
            // calculate leftsum
            for(int j = 0; j < i; j++){
                leftsum += nums[j];
            }
            // calculate rightsum
            for(int j = i + 1; j < nums.length; j++){
                rightsum += nums[j];
            }
            if(leftsum == rightsum){
               return i;
            }
        }
        return -1;
    }
}
