/*
Problem: Maximum Number of Words Found in Sentences

Approach:
Traversed each sentence and counted spaces.
Number of words = spaces + 1.
Tracked the maximum word count among all sentences.
*/
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;

        for(int i = 0; i < sentences.length; i++) {
            int words = 1;

            for(int j = 0; j < sentences[i].length(); j++) {
                if(sentences[i].charAt(j) == ' ') {
                    words++;
                }
            }

            if(words > maxWords) {
                maxWords = words;
            }
        }

        return maxWords;
    }
}
