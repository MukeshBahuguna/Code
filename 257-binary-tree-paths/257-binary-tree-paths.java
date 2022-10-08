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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> l =new ArrayList<>();
        f(root,l,"");
        return l;
    }
    
    public void f(TreeNode root, List<String> l ,String s){
        if(root==null) return ;
        
        if(root.left==null && root.right==null){
            s+=root.val;
            l.add(s);
            return ;
        }
        
        f( root.left , l, s+root.val+"->"  );
        f( root.right , l, s+root.val+"->"  );
    }
}