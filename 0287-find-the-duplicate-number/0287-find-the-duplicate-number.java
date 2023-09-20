class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int f =0;
        int s =0;
        int ans=0;
        int i=0;
        while(i<n){
            f=nums[nums[f]]; 
            s=nums[s]; 
            if(f==s) break;
            i+=1;
        }
        s=0;
        while(s!=f){
            s=nums[s];
            f=nums[f];    
        }
        return s;
    }
}