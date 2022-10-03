class Solution {
    public int minCost(String s, int[] a) {
        int n=a.length;
        char[] c= s.toCharArray();
        int sum=0,max=0;
        int cnt=0,ans=0;
        for(int i=0; i<n-1 ;i++){
            sum+=a[i];
            max=Math.max(a[i],max);
            if(c[i]==c[i+1]){
                cnt+=1;
            }
            else{
                if(cnt>=1)
                    ans+=sum-max;
                cnt=0;
                max=0;
                sum=0;
                
            }
        }
        
        if(cnt>=1){
            sum+=a[n-1];
            max=Math.max(a[n-1],max);
            ans+=sum-max;
        }
        return ans;
    }
}