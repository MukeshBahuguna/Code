class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n= nums.length;
        int[] avg= new int[n];
        Arrays.fill(avg,-1);
        
        int endSub=k*2;
        if(endSub+1 >n) return avg;
        
        long sum=0;
        for(int i=0 ; i<endSub+1 ;i++){
            sum+=nums[i];
        }
        long ans=sum/(endSub+1);
        avg[k]=(int)ans;
        
        int j=endSub+1;
        for(int i=k+1 ; i<n-k ;i++){
            sum+= nums[j];
            sum-= nums[i-k-1];
            
            ans=sum/(endSub+1);
            avg[i]=(int)ans;
            j+=1;
        }
        return avg;
    }
}