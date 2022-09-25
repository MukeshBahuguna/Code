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
    public boolean hasPathSum(TreeNode root, int t) 
    {
        if(root==null ) return false;
        return f(root,t,0);
    }
    public boolean f(TreeNode root ,int t, int s){
        if(root==null) return false;
                        
        if(s+root.val==t && root.left==null && root.right==null) return true;
        
        boolean a=f(root.left,t,s+root.val);
        boolean b=f(root.right,t,s+root.val);

        return a||b;
    }
}