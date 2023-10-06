class Solution {
    public int integerBreak(int n) {
        if(n<=3) return n-1;
        int x= n%3;
        int y=n/3;
        if(x>0){
            if(x==1) return (int)Math.pow(3,y-1) * 4;
            if(x==2) return (int)Math.pow(3,y) * 2;
        }
        return (int) Math.pow(3, y);
    }
}