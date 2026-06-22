/*
Problem: Palindrome Number

Approach:
Reversed the given number using a while loop.
Compared the reversed number with the original number.

Time Complexity: O(d)
Space Complexity: O(1)
*/
class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int reverse = 0;

        while(x>0){
            int digit=x%10;
            reverse = reverse*10 + digit;
            x = x/10;
        }

        if(original==reverse){
            return true;
        }
        else{
            return false;
        }
    }
}
