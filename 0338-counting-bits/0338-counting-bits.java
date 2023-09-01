class Solution {
    public int[] countBits(int n) {
        int[] a = new int[n+1];
        for(int i=0 ; i<=n ; i++){
            a[i] = setBits(i);
        }
        return a;
    }
    
    public int setBits(int x){
        int c=0;
        for(int i=0 ; i<32 ;i++){
            if((x & (1<<i))!=0) c+=1;
        }
        return c;
    }
}