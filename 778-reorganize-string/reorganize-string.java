class Solution {
    public String reorganizeString(String s) {
        if(s == null || s.length() == 1) {
            return s;
        }
        char maxChar = s.charAt(0);
        Map<Character, Integer> charCount = new HashMap<>();
        for(char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            if(charCount.get(c) > charCount.get(maxChar)) {
                maxChar = c;
            }
        }
        if(charCount.get(maxChar) > (s.length() + 1) / 2) {
            return "";
        }

        char[] result = new char[s.length()];
        int i = 0;
        int maxCharCount = charCount.get(maxChar);
        while(maxCharCount != 0) {
            result[i] = maxChar;
            i = i + 2;
            maxCharCount--;
        }

        for(char c : charCount.keySet()) {
            if(c == maxChar) {
                continue;
            }
            int count = charCount.get(c);
            while(count > 0) {
                if(i >= s.length()) {
                    i = 1;
                }
                result[i] = c;
                i = i+2;
                count--;
            }
        }
        return String.valueOf(result);
    }
}