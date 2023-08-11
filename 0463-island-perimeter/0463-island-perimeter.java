class Solution {
    public int islandPerimeter(int[][] grid) {
        int n =grid.length , m = grid[0].length;
        int ans=0;
        for (int i =0 ; i <n ;i++){
            for(int j=0 ;j<m ;j++){
                if(grid[i][j]==1){
                    ans+=check(grid , i ,j);
                }
            }
        }
        return ans;
    }
    public int check(int[][] grid , int i ,int j) {
        int n =grid.length , m = grid[0].length;
        int c=0;
        if(i-1<0 || grid[i-1][j]!=1) c+=1;
        if(i+1>=n || grid[i+1][j]!=1) c+=1;
        if(j-1<0 || grid[i][j-1]!=1) c+=1;
        if(j+1>=m || grid[i][j+1]!=1) c+=1;
        return c;
    }
}