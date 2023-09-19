class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ans =new int[k];
        int n=mat.length , m=mat[0].length;
        int[][] a=new int[n][2];
        for(int i=0; i<n ;i++){
            int c=0;
            for(int j=0; j<m ;j++){
                if(mat[i][j]==1) c+=1;
            }
            a[i]=new int[] {i,c};
        }
        
        Arrays.sort(a, (x,y)-> x[1]-y[1]);
        for (int i=0 ; i<k ;i++){
            ans[i]=a[i][0];
        }
        return ans;
    }
}