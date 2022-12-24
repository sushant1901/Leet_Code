class Solution {
    public int findCircleNum(int[][] graph) {
        int n= graph.length;
        int ans=0;
        boolean[] visited= new boolean[n];
        for(int currentCity=0; currentCity < n; currentCity++){
            if(visited[currentCity]==false){
                Dfs(graph,currentCity,n,visited);
                ans+=1;
            }
        }
        return ans;
    }

    private void Dfs(int [][] graph, int currentCity,int n,boolean[] visited){
        if(visited[currentCity]) return;
        visited[currentCity]=true;
        int [] neighbours=graph[currentCity];
        for(int i=0;i<n;i++){
            if(neighbours[i]==1)
            Dfs(graph,i,n,visited);
        }
        return;
       
    }
}
