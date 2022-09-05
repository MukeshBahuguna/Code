/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        if(root==null) return new ArrayList<>();
        
        List<List<Integer>> l = new ArrayList<>();
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()) {
            int len=q.size();
            List<Integer> l1 = new ArrayList<Integer>();
            for(int i=0 ; i<len; i++){
                Node a = q.poll(); 
                l1.add(a.val);
                int n=a.children.size();
                for(int k=0 ; k<n ;k++){
                    q.add(a.children.get(k));
                }
            }
            l.add(l1);
		}
		return l;
    }
}