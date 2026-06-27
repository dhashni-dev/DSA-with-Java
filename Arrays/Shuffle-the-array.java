/* Problem : Shuffle the Array 
Approach :
     Created the result array
     Calculated result using 2n and 2n+1 formula to place x and y values respectively
*/
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for(int i = 0;i<n;i++){
           result[2*i] = nums[i];
           result[2*i+1]=nums[i+n];
        }
        return result;
    }
}
