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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        List<Integer> l= new ArrayList<>();
        List<Integer> l1= new ArrayList<>();
        pre(root,l);
        mpre(root,l1);
        System.out.println(l+ " "+l1);
        for(int i=0 ; i<l.size(); i++){
           if(l.get(i)!=l1.get(i)) return false;
        }
        return true;
        
    }
    public void pre (TreeNode root,List<Integer> l){
        if(root!=null){
            l.add(root.val);
            pre(root.left,l);
            pre(root.right,l);
        }
        else{
            l.add(-1);
        }
    }
    public void mpre (TreeNode root,List<Integer> l1){
        if(root!=null){
            l1.add(root.val);
            mpre(root.right,l1);
            mpre(root.left,l1);
        }
        else{
            l1.add(-1);
        }
    }
}