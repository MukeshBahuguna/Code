class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums , goal)  - helper (nums , goal-1);
    }
    public int helper(int[] nums, int goal) {
        int n=nums.length;
        int s=0 ,ans=0;
        int j=0;
        for(int i=0 ; i<n ;i++){
            s+=nums[i];
            while(s>goal && j<=i) {
                s-=nums[j];
                j++;
            }
            ans+=(i-j+1);
        }
        return ans;
    }
}