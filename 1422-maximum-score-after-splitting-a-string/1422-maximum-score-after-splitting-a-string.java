class Solution {
    public int maxScore(String s) {
        char[] s1= s.toCharArray();
        int n=s.length();
        int[] a= new int[n];
        int max= 0;
        for(int i=n-2 ; i>=0 ;i--) a[i]= a[i+1] + (s1[i+1]=='1' ? 1 : 0);
        int c=0;
        for(int i=0; i<n-1; i++){
            if(s1[i]=='0') c+=1;
            max=Math.max(max ,c+a[i]);
        }
        return max;
    }
}