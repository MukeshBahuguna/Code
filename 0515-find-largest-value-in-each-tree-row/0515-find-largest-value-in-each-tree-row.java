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
    public List<Integer> largestValues(TreeNode root) {
        if(root==null) return new ArrayList<>();
        
        List<Integer> l = new ArrayList<>();
		
		Deque<TreeNode> q = new ArrayDeque<TreeNode>();
		q.add(root);
		while(!q.isEmpty()) {
            int len=q.size();
            int max=Integer.MIN_VALUE;
            for(int i=0 ; i<len; i++){
                TreeNode a = q.pop(); //removes first
                max=Math.max(a.val , max);
                if(a.left!=null) q.add(a.left);
                if(a.right!=null) q.add(a.right);
            }
            l.add(max);
			
		}
		return l;
    }
}