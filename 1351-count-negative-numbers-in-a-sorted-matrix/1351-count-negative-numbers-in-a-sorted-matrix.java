class Solution {
    public int countNegatives(int[][] grid) {
        int ans=0;
        int n=grid.length , m = grid[0].length;
        int i=n-1 ,j=0; 
        
        while(i>=0 && j<=m-1){
            if(grid[i][j]>=0){
                j+=1;
            }   
            else {
                ans+=m-j;
                i-=1;
            }
        }
        return ans;
    }
}