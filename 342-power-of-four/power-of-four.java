class Solution {
    public boolean isPowerOfFour(int num) {
        boolean po2= num > 0 && ((num & (num-1)) == 0);
        int nob= (int)(Math.log(num) / Math.log(2) + 1);
        if ((nob % 2) !=0 && po2) return true;
        return false;
        
    }
}