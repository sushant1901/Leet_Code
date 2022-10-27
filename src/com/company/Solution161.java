/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    HashMap<TreeNode,List<TreeNode>> map = new HashMap<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        if(K==0){
            ans.add(target.val);
            return ans;
        }
        
        //construct a graph using map representing adjacency list
        buildGraph(root,null);
        
        //do BFS from target
        HashSet<TreeNode> visited = new HashSet<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(target);
        visited.add(target);
        while(K>0){
            K--;
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode cur = q.poll();
                List<TreeNode> cur_list = map.get(cur);
                for(int j=0;j<cur_list.size();j++){
                    TreeNode next = cur_list.get(j);
                    if(!visited.contains(next)){
                        if(K==0){
                            ans.add(next.val);
                        }
                        visited.add(next);
                        q.offer(next);
                    }
                }                
            }
            if(K==0) return ans;
        }
        return ans;
    }
    
    public void buildGraph(TreeNode cur,TreeNode pre){
        if(cur==null) return;
        if(map.containsKey(cur)) return;
        map.put(cur,new ArrayList<TreeNode>(){});
        if(pre!=null){
            map.get(cur).add(pre);
            map.get(pre).add(cur);
        }
        buildGraph(cur.left,cur);
        buildGraph(cur.right,cur);
    }
}
