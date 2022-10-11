class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n=nums.length;
        int min=nums[0];
        
        int[] suff= new int[n];
        suff[n-1]= nums[n-1];
        
        for(int i=n-2; i>=0 ;i--) suff[i]= Math.max(suff[i+1],nums[i+1]);
        // System.out.println(Arrays.toString(suff));
        for(int i=1; i<n-1 ;i++){
            if(nums[i]>min && nums[i]<suff[i]){
                return true;
            }
            min=Math.min(min,nums[i]);
        }
        return false;
    }
}