class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int ans=0;
        int min=Integer.MAX_VALUE;
        for(int i=0 ;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            
            while(j<k){
                int x= nums[i]+nums[j]+nums[k];
                
                if(min>Math.abs(x-target)){
                    min=Math.abs(x-target);
                    ans=x;
                }
    
                if(x==target) return x;

                else if(x<target)  j+=1;
        
                else k-=1;
            }
        }
        return ans;
    }
}