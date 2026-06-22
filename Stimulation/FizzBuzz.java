/*
Problem: Fizz Buzz

Approach:
Traversed numbers from 1 to n.
Added "Fizz", "Buzz", "FizzBuzz", or the number itself to a list based on divisibility.

Time Complexity: O(n)
Space Complexity: O(n)
*/
class Solution {
    public List<String> fizzBuzz(int n) {
       List<String> result = new ArrayList<>(); 
       for(int i = 1; i <= n; i++){
        if(i % 3 == 0 && i % 5 == 0){
            result.add("FizzBuzz");
        }
        else if (i % 3 == 0){
            result.add("Fizz");
        }
        else if (i % 5 == 0){
            result.add("Buzz");
        }
        else {
            result.add(String.valueOf(i));
        }
       }
       return result;
    }
}
