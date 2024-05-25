class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int n=nums.length;
        int ans =-1;
        
        for (int i=0 ; i<n ;i++){
            int val= -nums[i];
            s.add(nums[i]);
            if ((nums[i]<0 && s.contains(val))  || (nums[i]>0 && s.contains(val))){
                ans=Math.max(ans , Math.abs(nums[i]));
            }
        }
        return ans;
    }
}