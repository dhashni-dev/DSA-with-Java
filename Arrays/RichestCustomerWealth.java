/*
Problem: Richest Customer Wealth

Approach:
Calculated the wealth of each customer by summing all accounts in a row.
Tracked the maximum wealth among all customers.

Time Complexity: O(m × n)
Space Complexity: O(1)
*/
class Solution {
    public int maximumWealth(int[][] accounts) {
      int maxWealth = 0;
      for(int i=0; i<accounts.length;i++){
        int wealth = 0;
        for(int j =0;j<accounts[i].length;j++){
            wealth +=accounts[i][j];
        }
        if(wealth>maxWealth){
            maxWealth=wealth;
        }
      }
      return maxWealth;
    }
}
