/*
Problem: Final Value of Variable After Performing Operations

Approach:
Started with output = 0.
Traversed all operations.
Incremented output for "++" operations and decremented output for "--" operations.
*/
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int output = 0;

        for(int i = 0; i < operations.length; i++) {
            if(operations[i].contains("++")) {
                output++;
            } else {
                output--;
            }
        }

        return output;
    }
}
