class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int i=0 , j=0;
        
        while(i<n){
            if(nums[i]%2==0){
               int t= nums[i];
                nums[i] = nums[j];
                nums[j]=t;
                j+=1; 
            }
            i+=1;
        }
        return nums;
    }
}