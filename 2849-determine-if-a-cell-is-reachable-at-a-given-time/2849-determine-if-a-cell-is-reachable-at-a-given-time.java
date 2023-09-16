class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int x=sx , y=sy;
        int valX =Math.abs(fx-x) , valY=Math.abs(fy-y);
        int max=Math.max(valX ,valY);
        if (valX==0 && valY==0 && t==1) return false;
        return max<=t;
    }
}