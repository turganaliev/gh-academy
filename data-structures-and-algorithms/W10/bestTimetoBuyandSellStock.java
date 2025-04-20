class Solution {
    public int maxProfit(int[] prices) {
        int lowest_price_so_far = prices[0];
        int highest_profit = 0;
        for (int price_today : prices) {
            highest_profit = Math.max(highest_profit, price_today - lowest_price_so_far);
            lowest_price_so_far = Math.min(lowest_price_so_far, price_today);
        }
    return highest_profit;
    }
}