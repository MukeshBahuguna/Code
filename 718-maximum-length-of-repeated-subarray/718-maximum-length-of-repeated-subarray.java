class Solution {
    public int findLength(int[] nums1, int[] nums2) {int n=nums1.length, m=nums2.length;
        int[][] dp =new int [n+1][m+1];
        int max=0;
        for(int i=1; i<=n ;i++){
            for(int j=1; j<=m ;j++){
                if(nums1[i-1]==nums2[j-1]){
                    //we are doing this because we want to know weather elements just before both i and j had a value or they were equal 
                    dp[i][j]= 1+dp[i-1][j-1]  ;
                    max=Math.max(max,dp[i][j]);
                }
                else dp[i][j]=0;
            }
        }
        return max;
    }
}