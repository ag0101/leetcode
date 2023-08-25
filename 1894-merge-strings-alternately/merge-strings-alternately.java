class Solution {
    public String mergeAlternately(String word1, String word2) {
        int word1Length = word1.length();
        int word2Length = word2.length();
        char[] mergedCharArray = new char[word1Length + word2Length];

        int i = 0;
        int j = 0;
        int k = 0;
        while(i < word1Length || j < word2Length) {
            if(i < word1Length) {
                mergedCharArray[k++] = word1.charAt(i++);
            }
            if(j < word2Length) {
                mergedCharArray[k++] = word2.charAt(j++);
            }
        }
        return new String(mergedCharArray);
    }
}