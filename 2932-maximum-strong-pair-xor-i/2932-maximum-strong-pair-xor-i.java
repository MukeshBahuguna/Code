class Solution {
    public int maximumStrongPairXor(int[] nums) {
        //range nums[i]+nums[i]
        //2p & 2p-1 xor
        int n= nums.length;
        Arrays.sort(nums);

        int ans=0;
        for(int i=0 ;i<n ;i++){
            for(int j=i ; j<n ;j++){
                if(Math.min(nums[i] , nums[j]) >= Math.abs(nums[i] - nums[j])){
                    ans=Math.max(ans,nums[i]^nums[j]);
                }
                else break;
            }
        }
        return ans;
    }
}