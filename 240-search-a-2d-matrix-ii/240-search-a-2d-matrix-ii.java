class Solution {
    public boolean searchMatrix(int[][] m, int t) {
        int n=m.length, a= m[0].length;
        int i=0 ,j=a-1;
        
        while(i<n && j>=0){
            if(m[i][j]==t) return true;
            else if(m[i][j]<t) i+=1;
            else j-=1;
        }
        return false;
    }
}