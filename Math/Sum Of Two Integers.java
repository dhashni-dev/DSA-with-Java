/*Problem : Sum of Two Integers

Approach:

1. Use the XOR (^) operator to add two numbers without considering carry bits.
2. Use the AND (&) operator to find carry bits, shift them left by one position (<< 1), and repeat the process until no carry remains.
*/
class Solution {
    public int getSum(int a, int b) {
       while (b != 0) {
        int carry = a & b;
        a = a ^ b;
        b = carry << 1;
    }
    return a;
    }
}
