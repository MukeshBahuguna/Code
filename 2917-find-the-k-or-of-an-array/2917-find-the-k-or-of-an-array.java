class Solution {
    public int findKOr(int[] nums, int k) {
        int ans=0;
        for(int j=0; j<32 ;j++){
            int c=0;
            for(int i=0 ; i <nums.length ;i++){
                int kOr= nums[i] & (1<<j);
                if(kOr!=0) c+=1;
            }
            if(c>=k){
                ans+=Math.pow(2,j);
            }
        }
        return ans;
    }
}