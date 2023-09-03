class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = buildGraph(n, edges);

        boolean[] visited = new boolean[n];

        return hasValidPath(graph, visited, source, destination);
    }

    private boolean hasValidPath(List<List<Integer>> graph, boolean[] visited, int source, int destination) {
        if(source == destination) {
            return true;
        }
        visited[source] = true;
        for(int neighbour: graph.get(source)) {
            if(visited[neighbour] == true) {
                continue;
            }
            if (hasValidPath(graph, visited, neighbour, destination)) {
                return true;
            }
        }
        return false;
    }

    private List<List<Integer>> buildGraph(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for(int[] edge: edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        return graph;
    }
}