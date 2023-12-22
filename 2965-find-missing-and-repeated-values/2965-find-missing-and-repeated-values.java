class Solution {
    public int[] findMissingAndRepeatedValues(int[][] arr) {
        int size= arr.length;
        int[] ans =new int[2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int abs_val = Math.abs(arr[i][j]);
                double temp = (double)abs_val / size;
                int row = (int)Math.ceil(temp) -1;
                int col= abs_val%size==0 ? size-1: (abs_val%size) -1;
                if (arr[row][col] > 0) arr[row][col] = -arr[row][col];
                else ans[0]=abs_val;
            }
        }
        int c=0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                c+=1;
                if (arr[i][j] > 0) ans[1] = c;
            }
        }
        return ans;
    }
}