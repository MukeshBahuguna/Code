class Solution {
    public int eraseOverlapIntervals(int[][] a) {
        Arrays.sort(a , (x,y)-> x[1]-y[1]);
        int n=a.length;
        int[] t=a[0];
        int c=0;
        for(int i=1 ;i<n ;i++){
            if(t[1] > a[i][0]){
                c+=1;
            }
            else{
                t[0]=Math.min(a[i][0],t[0]);
                t[1]=Math.max(a[i][1],t[1]);
            }
        }
        return c;
    }
}