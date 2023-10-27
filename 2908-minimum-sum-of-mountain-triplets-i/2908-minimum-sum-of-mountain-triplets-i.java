class Solution {
    public int minimumSum(int[] nums) {
        int n= nums.length;
        int minS=0 ,minSum=Integer.MAX_VALUE;
        int[] suff = new int[n];
        suff[n-1]=nums[n-1];
        for(int i=n-2 ; i>=0 ;i--) suff[i]=Math.min(suff[i+1] , nums[i]);
        
        for(int i=1 ; i<n-1 ;i++){
            if(nums[minS]< nums[i] && nums[i]> suff[i+1]) minSum=Math.min(minSum , nums[minS]+nums[i]+suff[i+1]);
            minS= nums[minS]>nums[i] ? i : minS;
        }
        return minSum==Integer.MAX_VALUE ? -1 : minSum;
    }
}