class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int n=prices.length;
        int i=0 , j =1;
        int ans=money - (prices[i] + prices[j]);
        return  ans>= 0 ? ans : money;
    }
}