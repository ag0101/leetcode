class Solution {
    public int numIslands(char[][] grid) {
        int numOfIslands = 0; 
        for(int i = 0; i < grid.length; i++) {
            for(int j =0; j < grid[i].length; j++) {
                if(grid[i][j] == '1') {
                    numOfIslands++;
                    dfs(grid, i, j);
                } 
            }
        }
        return numOfIslands;
    }

    private void dfs(char[][] grid, int row, int col) {
        if(row < 0 || col < 0 || col >= grid[0].length || row >= grid.length || grid[row][col]== '0') {
            return;
        }
        grid[row][col] = '0';
        dfs(grid, row+1 , col);
        dfs(grid, row, col+1);
        dfs(grid, row-1, col);
        dfs(grid, row, col-1);

    }
}