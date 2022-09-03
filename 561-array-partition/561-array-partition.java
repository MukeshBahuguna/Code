class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length;
        int s=0;
        for(int i=0 ; i<n ;i+=2){
            s+= Math.min(nums[i],nums[i+1]);
        }
        return s;
    }
}