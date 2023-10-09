class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] a= new int[2];
        
        a[0]=binS(nums ,-1,target);
        a[1]=binS(nums,1 ,target);
        
        return a;
    }
    public int binS(int[] nums ,int dirX , int target){
        int n=nums.length;
        int i=0 , j=n-1;
        int ind=-1;
        while(i<=j){
            int mid =(i+j)/2;
            if(nums[mid] == target){
                ind=mid;
                if(dirX==-1) j=mid-1;
                else i=mid+1;
            }
            else if(nums[mid] < target) i=mid+1;
            
            else j=mid-1;
        }
        return ind;
        
    }
}