class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int result = 0;
        for(int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }
        for(int j = 0; j < grid[0].length; j++) {
            int max = 0;
            for(int i = 0; i < grid.length; i++) {
                max = Math.max(grid[i][j], max);
            }
            result += max;
        }
        return result;
    }
}