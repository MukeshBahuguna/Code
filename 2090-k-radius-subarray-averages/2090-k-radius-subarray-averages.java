class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n= nums.length;
        int[] avg= new int[n];
        Arrays.fill(avg,-1);
        
        int endSub=k*2+1;
        if(endSub>n) return avg;
        
        long sum=0;
        for(int i=0 ; i<endSub ;i++){
            sum+=nums[i];
        }
        long ans=sum/endSub;
        avg[k]=(int)ans;
        
        int j=endSub;
        for(int i=k+1 ; i<n-k ;i++){
            sum+= nums[j];
            sum-= nums[i-k-1];
            
            ans=sum/endSub;
            avg[i]=(int)ans;
            j+=1;
        }
        return avg;
    }
}