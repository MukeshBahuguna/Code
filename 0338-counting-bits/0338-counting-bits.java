class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        Arrays.fill(ans,1);
        ans[0]=0;
        int p=0;
        for(int i=1;i<=n;i++)
        {
            if((i & (i-1))==0) p=i;
            else ans[i]=ans[p]+ans[i-p];
        }
        return ans;
    }
}