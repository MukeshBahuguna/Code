class Solution {
    public int findChampion(int[][] grid) {
        int n=grid.length , m =grid[0].length;
        int ans=0;
        for (int i=0; i<n; i++){
            boolean t=true;
            for (int j=0; j<m; j++){
                if(i!=j && grid[i][j]==0) t=false;
            }
            if(t) {
                ans=i;
                break;
            }
        }
        return ans;
    }
}