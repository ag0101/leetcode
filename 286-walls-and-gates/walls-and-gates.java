class Solution {
    private static final int GATE = 0;
    private static final int WALL = -1;
    private static final int EMPTY_ROOM = Integer.MAX_VALUE;
    private static final List<int[]> DIRECTIONS = Arrays.asList(
        new int[] {1, 0}, new int[] {0, 1}, new int[] {-1, 0}, new int[] {0, -1}
    );

    public void wallsAndGates(int[][] rooms) {
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < rooms.length; i++) {
            for(int j = 0; j < rooms[0].length; j++) {
                if(rooms[i][j] == GATE) {
                    q.add(new int[] {i, j});
                }
            }
        }
        while(!q.isEmpty()) {
            int[] current = q.poll();
            int currentRow = current[0];
            int currentCol = current[1];
            for(int[] direction : DIRECTIONS) {
                int newRow = currentRow + direction[0];
                int newColumn = currentCol + direction[1];
                if(newRow < 0 || newColumn < 0 || 
                newRow >= rooms.length || newColumn >= rooms[0].length || 
                rooms[newRow][newColumn] != EMPTY_ROOM) {
                    continue;
                }
                rooms[newRow][newColumn] = rooms[currentRow][currentCol] + 1;
                q.add(new int[] {newRow, newColumn});
            }
        }
    }
}