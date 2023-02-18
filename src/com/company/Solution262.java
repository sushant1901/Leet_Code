class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int [] colors= new int[n];
        Arrays.fill(colors,-1);
        
        for(int currentVertex=0;currentVertex<n;currentVertex++){
            if(colors[currentVertex]!=-1) continue;
            
            if(!hasEvenCycle(graph,currentVertex,0,colors)) return false;
        }
        
        return true;
    }
    
    private boolean hasEvenCycle(int[][] graph, int currentVertex,int currentColor,int[] colors){
        if(colors[currentVertex]!=-1) return colors[currentVertex]== currentColor;
        
        colors[currentVertex]=currentColor;
        
        for(int currentNeighbour: graph[currentVertex]){
            if(!hasEvenCycle(graph,currentNeighbour,1-currentColor,colors)) return false;
        }
        
        return true;
    }
}
