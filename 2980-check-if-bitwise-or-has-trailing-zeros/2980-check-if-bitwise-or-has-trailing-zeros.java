class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int c=0;
        for (int i=0 ;i<nums.length ;i++){
            if(nums[i]%2==0) c+=1;
        }
        return c>=2;
    }
}