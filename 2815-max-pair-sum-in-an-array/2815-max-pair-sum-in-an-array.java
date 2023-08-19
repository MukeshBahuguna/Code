class Solution {
    int[] a =new int[10];
    public int maxSum(int[] nums) {
        int n=nums.length;
        int ans=-1;
        for(int i=0 ; i<n ;i++){
            int x=find(nums[i]);
            if(a[x]!=0){
                ans=Math.max(a[x]+nums[i] ,ans);
            }
            if(a[x]<nums[i]) a[x]=nums[i];
        }
        return ans;
    }
    public int find(int n) {
        int max=0 ;
        while(n>0){
            max=Math.max(max , n%10);
            n=n/10;
        }
        return max;
    }
}