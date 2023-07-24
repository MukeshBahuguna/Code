class Solution {
     public double myPow(double x, int n) {
        return helper(x, n);
    }
    
    private double helper(double x, int n) {
        if (x == 0) return 0;
        if (n == 0) return 1;
        
        double res = helper(x, n / 2);
        res *= res;
        if (n % 2 != 0) {
            return (n > 0) ? res * x : res / x;
        } else {
            return res;
        }
    }
}