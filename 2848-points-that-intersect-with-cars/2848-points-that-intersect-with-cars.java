class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int[] v = new int[102];
        int ans = 0, sum = 0;
        for(List<Integer> n: nums){ v[n.get(0)]++; v[n.get(1)+1]--; }
        for(int i = 1; i <= 100; ++i){
            sum += v[i];
            if(sum != 0) ans++;
        }
        return ans;
    }
}