class Solution {
    public int findCircleNum(int[][] isConnected) {
        int numberOfProvinces = 0;
        int n = isConnected.length;
        List<List<Integer>> graph = buildGraph(isConnected);

        boolean[] visited = new boolean[n];

        for(int i =0; i <n; i++) {
            if(visited[i] == false) {
                numberOfProvinces++;
                dfs(graph, visited, i);
            }
        }
        return numberOfProvinces;
    }

    public void dfs(List<List<Integer>> graph, boolean[] visited, int currentNode) {
        visited[currentNode] = true;

        for (int neighbour : graph.get(currentNode)) {
            if(visited[neighbour] == false) {
                dfs(graph, visited, neighbour);
            }
        }
    }

    private List<List<Integer>> buildGraph(int[][] isConnected) {
        List<List<Integer>> graph = new ArrayList<>();

        for(int i = 0; i <isConnected.length; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < isConnected.length; i++) {
            for(int j = 0; j < isConnected[i].length; j++) {
                if(isConnected[i][j] == 1 && i != j) {
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }
        return graph;
    }
}