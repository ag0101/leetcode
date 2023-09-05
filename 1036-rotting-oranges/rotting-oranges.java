class Solution {
    private static final int EMPTY = 0;
    private static final int FRESH_ORANGE = 1;
    private static final int ROTTEN_ORANGE = 2;
    private static final List<int[]> DIRECTIONS = Arrays.asList(
        new int[] {0, 1}, new int[] {1, 0}, new int[] {-1, 0}, new int[] {0, -1}
    );

    public int orangesRotting(int[][] grid) {
        int countOfFreshOrange = 0;
        Queue<int[]> q = new LinkedList<>();
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j =0; j < grid[0].length; j++) {
                if(grid[i][j] == ROTTEN_ORANGE) {
                    q.offer(new int[] {i, j});
                } else if(grid[i][j] == FRESH_ORANGE){
                    countOfFreshOrange++;
                }
            }
        }
        if(countOfFreshOrange == 0) {
            return 0;
        }
        while(!q.isEmpty()) {
            ++count;
            int size = q.size();
            for(int i = 0 ; i < size ; i++) {
                int[] currentPos = q.poll();
                int currentRow = currentPos[0];
                int currentCol = currentPos[1];
                for(int[] direction : DIRECTIONS) {
                    int newRow = currentRow + direction[0];
                    int newColumn = currentCol + direction[1];
                    if(newRow < 0 || newColumn < 0 || newRow >=grid.length || newColumn >=grid[0].length
                    ||  grid[newRow][newColumn] != FRESH_ORANGE) {
                        continue;
                    }
                    grid[newRow][newColumn] = ROTTEN_ORANGE;
                    q.offer(new int[] {newRow, newColumn});
                    countOfFreshOrange--;
                }
            }
        }

        return countOfFreshOrange == 0 ? count - 1 : -1;
      
    }
}