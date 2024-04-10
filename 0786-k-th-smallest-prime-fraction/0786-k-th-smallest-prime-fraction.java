class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<int[]> pq =new PriorityQueue<>((a, b) -> {
                double x = a[0] / (1.0 * a[1]);
                double y = b[0] / (1.0 * b[1]);
                return x==y ? 0 : x>y ? -1 :1;
        });
        int n=arr.length;
        for(int i=0 ; i<n ;i++){
            int j=n-1;
            while(j>i){
                int[] x =new int[]{arr[i], arr[j]};
                pq.add(x);
                if(pq.size()>k) pq.poll();
                
                j-=1;
            }
        }
        return pq.poll();
    }
}