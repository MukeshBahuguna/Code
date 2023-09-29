class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length;
        int c=0 ,c1=0;
        for(int i=1; i<n;i++){
            if(nums[i]<nums[i-1]) c+=1;
            if(nums[i]==nums[i-1]) c1+=1;
        }
        return (c+c1)==n-1 || c==0;
    }
}