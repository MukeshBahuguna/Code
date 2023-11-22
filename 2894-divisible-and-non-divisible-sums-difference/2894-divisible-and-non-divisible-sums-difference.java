class Solution {
    public int differenceOfSums(int n, int m) {
        int sum= (n * (n+1) )/2;
        int s= n/m; 
        int sum1=0;
        for(int i=1; i<s+1 ;i++) sum1+= m*i;

        return sum - 2*sum1;
    }
}