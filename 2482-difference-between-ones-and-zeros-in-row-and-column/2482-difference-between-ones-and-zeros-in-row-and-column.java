class Solution {
    public int[][] onesMinusZeros(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[][] diff = new int[m][n];
        int row[]= new int[m];
        int col[]= new int[n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                row[i] += mat[i][j];
                col[j] += mat[i][j];
            }
        }
        int count=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                diff[i][j]= row[i] + col[j] - (m-row[i] + n-col[j]);
            }
        }
        return diff;
    }
}