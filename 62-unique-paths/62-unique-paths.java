class Solution {
    int c=0;
    int[][] dp ;
    public int uniquePaths(int m, int n) {
        if(n==1 && m==1) return 1;
        dp=new int[n][m];
        f(0,0,n,m);
        return dp[0][0];
    }
    public int f(int i, int j ,int n , int m) {
        if(i==n-1 && j==m-1) return 1;
        
        if(j==m || i==n) return 0;
        if(dp[i][j]!=0) return dp[i][j];
        
        int a= f(i+1 , j , n ,m);
        int b= f(i,j+1, n,m);
        
        dp[i][j]=a+b;
        return dp[i][j];
        
    }
}