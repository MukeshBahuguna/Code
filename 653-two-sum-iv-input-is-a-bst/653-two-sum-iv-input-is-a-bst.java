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
    public boolean findTarget(TreeNode root, int k) {
        TreeNode cur=root;
        return dfs(root,cur ,k);
    }
    
    public boolean dfs(TreeNode root,  TreeNode cur, int k){
        if(cur == null)  return false;
        if(check(root,cur,k-cur.val)) return true;
        boolean a= dfs(root, cur.left, k); 
        boolean b= a ? true : dfs(root, cur.right, k);
        
        return a||b;
    }
    
    public boolean check(TreeNode root, TreeNode cur, int val) {
        if(root==null) return false;
        
        if (root.val==val && root!=cur) return true;
        
        if (val<root.val)
            return check(root.left,cur,val);
        else
            return check(root.right,cur,val);
        
    }
}