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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> answer = new ArrayList<>();
        HashMap<TreeNode, TreeNode> parents = new HashMap<>();
        
        allParents(null, root, parents);
        
        nodesAtDistanceK(target, k, parents, new HashSet<>(), answer);
        
        return answer;
        
    }
    
    private void nodesAtDistanceK(TreeNode root, int k, HashMap<TreeNode, TreeNode> parents, HashSet<TreeNode> visited, List<Integer> answer){
        
        if(root == null || visited.contains(root)){
            return;
        }
        
        visited.add(root);
        
        if(k == 0){
            answer.add(root.val);
            return;
        }
        
        nodesAtDistanceK(root.left, k - 1, parents, visited, answer);
        nodesAtDistanceK(root.right, k - 1, parents, visited, answer);
        nodesAtDistanceK(parents.get(root), k - 1, parents, visited, answer);
        
    }
    
    private void allParents(TreeNode parent, TreeNode root, HashMap<TreeNode, TreeNode> parents){
        
        if(root == null){
            return;
        }
        
        parents.put(root, parent);
        
        allParents(root, root.left, parents);
        allParents(root, root.right, parents);
        
    }
    
}
