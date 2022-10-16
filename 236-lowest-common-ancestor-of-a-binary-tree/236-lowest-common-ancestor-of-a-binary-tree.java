class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null) return null;

        TreeNode a=lowestCommonAncestor(root.left,p,q);
        TreeNode b=lowestCommonAncestor(root.right,p,q);
                        
        if(root.val==p.val || root.val==q.val) return root;

        if(a!=null && b!=null) return root;
        if(a!=null) return a;
        if(b!=null) return b;
        
        return null;
    }

}