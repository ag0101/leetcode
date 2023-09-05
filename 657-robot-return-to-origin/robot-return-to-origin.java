class Solution {
    public boolean judgeCircle(String moves) {
        int horizontalMovementCount = 0;
        int verticalMovementCount = 0;
        for(char c : moves.toCharArray()) {
            if(c == 'L') {
                horizontalMovementCount--;
            } else if(c == 'R') {
                horizontalMovementCount++;
            } else if(c == 'U') {
                verticalMovementCount--;
            } else if(c == 'D') {
                verticalMovementCount++;
            }
        }
        if (horizontalMovementCount == 0 && verticalMovementCount == 0) {
            return true;
        } else {
            return false;
        }
    }
}