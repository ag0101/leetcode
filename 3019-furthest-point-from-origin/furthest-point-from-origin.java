class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int countOfL = 0;
        int countOfR = 0;
        int countOfSpaces = 0;
        for(char c : moves.toCharArray()) {
            if (c == 'L') {
                countOfL++;
            } else if (c == 'R') {
                countOfR++;
            } else if (c == '_') {
                countOfSpaces++;
            } 
        }
        return countOfL > countOfR ? (countOfL + countOfSpaces - countOfR) : (countOfR + countOfSpaces - countOfL);
    }
}