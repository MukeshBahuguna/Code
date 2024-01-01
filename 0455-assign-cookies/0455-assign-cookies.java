class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n=g.length , m= s.length;
        if(m==0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        
        int i=n-1 , j=m-1;
        int ans=0;
        while(i>=0 && j>=0){
            if(g[i]<=s[j]){
                ans+=1;
                i-=1;
                j-=1;
            }
            else i-=1;
        }
        return ans;
    }
}