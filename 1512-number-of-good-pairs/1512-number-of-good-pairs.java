class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans=0,n=nums.length;
        int[] a = new int[101];
        
        for(int i=0  ;i<n ;i++) a[nums[i]]+=1;
        
        for(int i=0  ;i<101 ;i++) ans+=(a[i] * (a[i]-1))/2;
        return ans;
    }
}