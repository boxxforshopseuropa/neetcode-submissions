class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;

        int n = prices.length;

        for (int i = 0; i < n-1; i++) {
            int j = i+1;
            while (j < n && prices[i] < prices[j]) {
                int diff = prices[j] - prices[i];
                res = Math.max(res, diff);
                j++;
            }

        }

        return res;
    }
}
