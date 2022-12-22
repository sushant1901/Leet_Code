class Solution {
    int[] res, count;
    List<Set<Integer>> graph;
    int N;

    public int[] sumOfDistancesInTree(int N, int[][] edges) {
        this.N = N;
        res = new int[N];
        count = new int[N];
        graph = new ArrayList<>();

        // Initialize the value of count array. (Cuz it contains itself)
        Arrays.fill(count, 1);
        // Build the tree graph
        for (int i = 0; i < N; i++) {
            graph.add(new HashSet<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        // PreOrder Process
        dfs(0, -1);
        // PostOrder Process
        dfs2(0, -1);

        return res;
    }

    private void dfs(int node, int parent) {
        for (int child : graph.get(node)) {
            if (child != parent) {
                dfs(child, node);
                count[node] += count[child];
                res[node] += res[child] + count[child];
            }
        }
    }

    private void dfs2(int node, int parent) {
        for (int child : graph.get(node)) {
            if (child != parent) {
                res[child] = res[node] - count[child] + N - count[child];
                dfs2(child, node);
            }
        }
    }
}
