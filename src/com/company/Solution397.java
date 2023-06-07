class Solution {
    public boolean canReach(int[] arr, int start) {
        int visited[] = new int[arr.length];
        return dfs(arr,start,visited);
    }
    boolean dfs(int[] arr,int p,int[] visited){
        if(p<0 || p>=arr.length || 1==visited[p]) return false;
        visited[p]=1;
        if(arr[p]==0) return true;
        return dfs(arr,p+arr[p],visited) || dfs(arr,p-arr[p],visited);
    }
}
 
