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
    public TreeNode addOneRow(TreeNode root, int val, int d) {
        if(d==1){
            TreeNode x=new TreeNode(val);
            x.left=root;
            return x;
        }        
        f(root,val,d,1);
        return root;
    }
    
    public void f(TreeNode root, int val ,int d ,int x){
        if(root==null)
            return ;
        
        if(x+1==d){
            TreeNode l= root.left;
            TreeNode r= root.right;
            
            root.left=new TreeNode(val);
            root.left.left=l;

            root.right =new TreeNode(val);
            root.right.right=r;  
        }
        f(root.left,val,d, x+1);
        f(root.right ,val,d,x+1);
        
    }
}