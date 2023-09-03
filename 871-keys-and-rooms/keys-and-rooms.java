class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean canVisitAllRooms = true;
        int n = rooms.size();

        boolean[] visited = new boolean[n];
        visited[0] = true;
        visitAllRooms(rooms, visited, rooms.get(0));
        for(int i = 0; i < n ; i++) {
            if(visited[i] == false) {
                return false;
            }
        }
        return canVisitAllRooms;
    }

    public void visitAllRooms(List<List<Integer>> rooms, boolean[] visited, List<Integer> nextRooms) {
        for(int nextRoom : nextRooms) {
            if(visited[nextRoom] == false) {
                visited[nextRoom] = true;
                visitAllRooms(rooms, visited, rooms.get(nextRoom));
            }
        }
    }
}