class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;
        for (int i : prices) {
            if (i < min) {
                min = i;
            } else {
                int temp = i - min;
                if (temp > maxProfit) maxProfit = temp;
            }
        }
        return maxProfit;
    }
}