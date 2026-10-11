class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int n = prices.length;
        int min = prices[0];

        for (int i = 1; i < n; i++) {
            if (prices[i] < min) {
                min = prices[i];
                continue;
            }
            res = Math.max(res, prices[i] - min);
        }
        return res;
    }
}
