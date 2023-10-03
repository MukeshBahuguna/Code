class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans=0,n=nums.length;
        int[] a = new int[101];
        
        for(int i=0  ;i<n ;i++) ans+=a[nums[i]]++;
        return ans;
    }
}