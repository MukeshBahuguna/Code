class Solution {
    public int numIdenticalPairs(int[] nums) {
        Arrays.sort(nums);
        int c=0,ans=0,n=nums.length;
        for(int i=1  ;i<n ;i++){
            if(nums[i]==nums[i-1]) c+=1;
            else{
                ans+=(c*(c+1))/2;
                c=0;
            }
        }
        ans+=(c*(c+1))/2;
        return ans;
    }
}