class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int max_time=logs[0][1];
        int ans=logs[0][0];
        for(int i=1 ;i<logs.length ;i++){
            int x=logs[i][1]-logs[i-1][1];
            if(max_time<=x){
                ans= max_time==x ? Math.min(logs[i][0],ans) : logs[i][0];
                max_time=x;
            }
        }
        return ans;
    }
}