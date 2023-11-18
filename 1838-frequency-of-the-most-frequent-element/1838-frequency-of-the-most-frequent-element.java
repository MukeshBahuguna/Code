class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n= nums.length;
        Arrays.sort(nums);
        long s=0 ;
        int i=0 ,j=0;
        int max=0;
        while(j<n){
            s+=nums[j];
            if( s+k >= (long)((j-i+1)*nums[j])) max=Math.max(max , j-i+1);
            else{
                s-=nums[i];
                i+=1;
            }
            j+=1;
        }
        return max;
    }
}