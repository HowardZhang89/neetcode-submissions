class Solution {
    public int maxProfit(int[] prices) {

        // sliding window 
        // greedy algorithm 

        int l = 0;
        int r = l + 1;
        int max = 0;

        while(r < prices.length){
            if(prices[l] < prices[r]){
                int profit =  prices[r] - prices[l];
                max = Math.max(profit, max);
            }else{ // prices[r] < prices[l], new day to buy
                l = r;
            }
            r++;
        }

        return max;
    }
}
