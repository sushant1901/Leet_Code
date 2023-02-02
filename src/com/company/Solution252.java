class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length + 1;
        int[] edgeCount = new int[n+1];

        for(int[] edge: edges){
            int x = edge[0];
            int y = edge[1];
            edgeCount[x]++;
            edgeCount[y]++;

            if(edgeCount[x] > 1)
                return x;
            
            if(edgeCount[y] > 1)
                return y;
            
        }
        return 0;

    }
}
