class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> l= new ArrayList<>();
        int n=arr.length;
        
        PriorityQueue<Node> pq =new PriorityQueue<>((a,b)-> b.diff == a.diff ? b.idx -a.idx  : b.diff - a.diff);
        
        for(int i=0 ; i<n ;i++){
            Node node=new Node(i ,arr[i], Math.abs(arr[i]-x));
            pq.add(node);
            
            if(pq.size()>k) pq.poll();
        }
        while(!pq.isEmpty()) l.add(pq.poll().ele);
        Collections.sort(l);
        return l;
        
    }
}


class Node {
    int idx;
    int ele;
    int diff;
    
    Node(int idx , int ele , int diff){
        this.idx =idx;
        this.ele =ele;
        this.diff =diff;       
    }
}