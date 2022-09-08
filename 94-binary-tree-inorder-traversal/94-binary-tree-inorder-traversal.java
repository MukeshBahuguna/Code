/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l= new ArrayList<>();
        
        Stack<TreeNode> s= new Stack<>();

        TreeNode t=root;
        
        while(t!=null || !s.isEmpty()){
            while(t!=null){
                s.push(t);
                t=t.left;
            }
            TreeNode x= s.pop();
            l.add(x.val);
            if(x.right!=null) t=x.right;
            
        }
        return l;
    }
}