class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> charCount = new HashMap<>();
        for(char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for(char c : t.toCharArray()) {
            if(!charCount.containsKey(c) || charCount.get(c) == 0) {
                return c;
            } else {
                charCount.put(c, charCount.get(c) - 1);
            }
        }
        return 'c';
    }
}