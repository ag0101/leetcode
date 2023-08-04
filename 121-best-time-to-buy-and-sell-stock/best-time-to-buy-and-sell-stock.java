class Solution {
    public int maxProfit(int[] prices) {
        int maxProfitSoFar = 0;
        int minSoFar = prices[0];
        for(int i = 1; i < prices.length ; i++) {
            if(prices[i] < minSoFar) {
                minSoFar = prices[i];
            } else {
                maxProfitSoFar = Math.max(maxProfitSoFar, prices[i] - minSoFar);
            }
        }
        return maxProfitSoFar;
    }
}