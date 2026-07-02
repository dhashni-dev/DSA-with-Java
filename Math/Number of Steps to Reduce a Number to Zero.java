/*
Problem: Number of Steps to Reduce a Number to Zero

Approach:
Repeatedly checked whether the number was even or odd.
If even, divided it by 2.
If odd, subtracted 1.
Counted each operation until the number became 0.
*/
class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while(num > 0){
            if(num % 2 == 0){
                num = num/2;
                count++;
            }
            else{
                num = num - 1;
                count++;
            }
        }
        return count;
    }
}
