/*
Problem: Find Numbers with Even Number of Digits

Approach:
Used a while loop to count the digits of each number.
Checked if the digit count was even and increased the count.
*/

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int digits = 0;
            while(num > 0){
                digits++;
                num = num/10;
            }

            if(digits % 2 == 0){
                count++;
            }
            
        }
         return count;
    }
}
