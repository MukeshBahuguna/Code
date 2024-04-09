class Solution {
    public int timeRequiredToBuy(int[] t, int k) {
        int s=0;
        for (int i = 0; i < t.length; i++) {
            if (i <= k) {
                s += Math.min(t[i], t[k]);
            } else {
                s += Math.min(t[i], t[k] - 1);
            }
        }

        return s;
    }
}