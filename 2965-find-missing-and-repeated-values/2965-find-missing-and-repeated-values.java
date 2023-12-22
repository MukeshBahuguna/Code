class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long sum = 0, sqrSum = 0, n = grid.length, N = n*n;
        
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
                sum += grid[i][j];
                sqrSum += grid[i][j] * grid[i][j];
            }
        }
        long c1 = sum - N * (N + 1)/2,  c2 = sqrSum - N*(N+1)*(2*N + 1)/6;
        return new int[]{(int)(c2/c1 + c1)/2, (int)(c2/c1 - c1)/2};
    }
}