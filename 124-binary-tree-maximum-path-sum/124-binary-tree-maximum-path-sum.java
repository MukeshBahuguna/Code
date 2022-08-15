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
    int max=0;
    public int maxPathSum(TreeNode root) {
        max=root.val;
        f(root);
        return max;
    }
    public int f(TreeNode root){
        if(root==null) return 0;
        
        int a= Math.max(0,f(root.left));
        int b= Math.max(0,f(root.right));
        
        max=Math.max(max,a+b+root.val);
        
        return root.val + Math.max(a,b);
    }
}