class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        int numOfMinutes = 0;
        List<List<Integer>> graph = new ArrayList<>(n);
        for(int i = 0 ; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for(int i =0; i < n ; i++) {
            if(manager[i] != -1) {
                graph.get(manager[i]).add(i);
            }
        }

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {headID, 0});

        while(!q.isEmpty()) {
            int[] currentEmployeeAndTime = q.poll();
            int currentEmployee = currentEmployeeAndTime[0];
            int currentTime = currentEmployeeAndTime[1];
            numOfMinutes = Math.max(numOfMinutes, currentTime);
            for(int reportee : graph.get(currentEmployee)) {
                q.offer(new int[]{reportee, currentTime + informTime[currentEmployee]});
            }

        }

        return numOfMinutes;

    }
}