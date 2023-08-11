class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        if(n==1) return nums[0]==target;
        int i=0 , j=n-1;
        while(i<=j){
            int mid =  i + (j-i)/2;
            if(nums[mid] == target){
                return true;  
            } 
            else{
                int x=mid-1,y=mid+1;
                while(x>=0 && nums[mid]==nums[x]) x-=1;
                while(y<n && nums[mid]==nums[y]) y+=1;
                
                if(y>=n) j=mid-1;
                else if(x<0) i=mid+1;
                else{
                    if(nums[0]<=nums[mid]) {
                        if(nums[0]<=target && target<=nums[mid]) j=x;
                        else i=y;
                    }
                    else if(nums[mid]<=nums[n-1]) {
                        if(nums[n-1]>=target && target>=nums[mid]) i=y;
                        else j=x;
                    }
                }
                
            }
        }
        return j>=0 ? nums[j]==target : nums[i]==target;
        
    }
}