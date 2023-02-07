class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
    ArrayList<ArrayList<Integer>> graph= constructGraph(numCourses,prerequisites);
        int[] indegree= new int[numCourses];
        
        for(int currentCourse=0;currentCourse<numCourses;currentCourse++){
            for(int currentNeigh:graph.get(currentCourse))
                indegree[currentNeigh]+=1;
        }
        
        Queue<Integer> q= new LinkedList<>();
        ArrayList<Integer>order= new ArrayList<>();
        
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0) q.add(i);
        }
        
        boolean[] visited = new boolean[numCourses];
        
        while(!q.isEmpty()){
            int currentCourse=q.remove();
            
            if(visited[currentCourse])continue;
            
            visited[currentCourse]=true;
            
            order.add(currentCourse);
            for(int currentNeigh:graph.get(currentCourse)){
                indegree[currentNeigh]-=1;
                if(indegree[currentNeigh]==0) q.add(currentNeigh);
            }
        }
        
        return order.size()==numCourses;
    }
    
    private ArrayList<ArrayList<Integer>> constructGraph(int n,int[][] edges){
        ArrayList<ArrayList<Integer>> graph= new ArrayList<>();
        for(int i=0;i<n;i++)
            graph.add(new ArrayList<Integer>());
        
        for(int[] currentEdge: edges){
            int a=currentEdge[0];
            int b=currentEdge[1];
            
            graph.get(b).add(a);
        }
        
        return graph;
    }
}
