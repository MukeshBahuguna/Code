class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int max=0;
        for(int i=2 ;i<n ;i++)
            if(nums[i]<(nums[i-1] + nums[i-2])) max=Math.max(nums[i]+nums[i-1] +nums[i-2],max);
        return max;
    }
}