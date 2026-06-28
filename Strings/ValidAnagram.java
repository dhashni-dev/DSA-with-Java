/*
Problem : Valid Anagram
Approach : Use an array of size 26 to track counts of each character. 
Increase count for characters in s and decrease for t. If all values become 0, the strings are anagrams.
*/
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26]; // assuming lowercase a-z

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
