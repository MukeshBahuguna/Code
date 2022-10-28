class Solution {
    public int candy(int[] a) {
        int n=a.length;
        int[] b= new int[n];
        Arrays.fill(b,1);
        for(int i=0; i<n-1; i++){
            if(a[i+1]>a[i]){
                b[i+1] = b[i]+1;
            }
        }
        for(int i=n-1; i>0; i--){
            if(a[i-1]>a[i] && b[i-1]<=b[i]){
                b[i-1] = b[i]+1;
            }
        }
        int s=0;
        for(int i=0; i<n; i++){
            s += b[i];
        }
        return s;
    }
}