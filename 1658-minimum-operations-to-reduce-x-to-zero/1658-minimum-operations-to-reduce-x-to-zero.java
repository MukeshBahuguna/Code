class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int ts= 0;
        for(int i:nums) ts+=i;
        
        if(ts<x) return -1;
        else if(ts==x) return n;
        
        int tar =ts-x;
        int min=n+1;
        int i=0,j=0;
        int s=0;
        while(i<n && j<n ){
            if(s<tar) s+=nums[j];
            while(i<=j && s>=tar) {
                if(s==tar) min=Math.min(min , (n-j-1 + i));
                s-=nums[i];
                i+=1;
            }
            j+=1;
        }
        return min==n+1 ? -1 : min;
        
    }
}