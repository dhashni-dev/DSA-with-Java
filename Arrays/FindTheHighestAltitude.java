/*
Problem: Find the Highest Altitude

Approach:
Maintained the current altitude using a running sum.
Tracked the maximum altitude reached during traversal.

Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int largestAltitude(int[] gain) {
        int current = 0;
        int max = 0;
        for(int i=0;i<gain.length;i++){
            current += gain[i];
        if(current > max){
            max = current;
        }
        }
    return max;   
    }
}
