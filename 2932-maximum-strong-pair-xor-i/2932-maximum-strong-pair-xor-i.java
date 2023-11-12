class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int n= nums.length;
        int ans=0;
        for(int i=0 ;i<n ;i++){
            for(int j=i ; j<n ;j++){
                if(Math.min(nums[i] , nums[j]) >= Math.abs(nums[i] - nums[j])){
                    ans=Math.max(ans,nums[i]^nums[j]);
                }
            }
        }
        return ans;
    }
}