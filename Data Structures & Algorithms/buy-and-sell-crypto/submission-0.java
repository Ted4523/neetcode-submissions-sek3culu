class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<prices[buy]) buy = i;
            profit = Math.max(profit,prices[i]-prices[buy]);
        }

        return profit;
    }
}
