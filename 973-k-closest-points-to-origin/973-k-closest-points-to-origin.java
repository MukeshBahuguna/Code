class Solution {
    
    class Pair{
        double val;
        int[] cord;
        
        public Pair(double val , int[] cord){
            this.val=val;
            this.cord=cord;
        }
    }
    
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq =new PriorityQueue<Pair>((a,b)->b.val>a.val ? 1 : b.val==a.val ? 0: -1);
        
        int n=points.length;
        for (int i=0 ; i<n ;i++){
            pq.add(new Pair(findDist(points[i][0],points[i][1]) , points[i]));
            if(pq.size()>k){
                pq.poll();
            }
        }
        int i=0;
        int[][] ans= new int[k][2];
        while(!pq.isEmpty()){
            Pair p= pq.poll();
            ans[i++]=p.cord;
        }
        return ans;
    }
    public double findDist(int x ,int y){
        return Math.sqrt(x*x+y*y);
    }
}
