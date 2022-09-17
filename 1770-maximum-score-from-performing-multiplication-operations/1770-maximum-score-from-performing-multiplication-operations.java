class Solution {
    public int maximumScore(int[] nums, int[] muls) {
        int n = nums.length;
        int m = muls.length;
        Integer[][] memo = new Integer[m][m];
        return dp(0, 0,memo,m,nums,muls);
    }
    private int dp(int l, int i,Integer[][] memo ,int m ,int[] nums,int[] muls) {
        if (i == m) return 0;
        if (memo[l][i] != null) return memo[l][i];
        int pickLeft = dp(l+1, i+1,memo,m,nums,muls) + nums[l] * muls[i];
        int pickRight = dp(l,i+1,memo,m,nums,muls) + nums[nums.length-(i-l)-1] * muls[i]; 
        return memo[l][i] = Math.max(pickLeft, pickRight);
    }
}