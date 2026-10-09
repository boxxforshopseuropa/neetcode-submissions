class Solution {
    public int maxArea(int[] heights) {
        if (heights.length < 2) {
            return 0;
        }
        int res = 0;
        int i = 0;
        int j = heights.length - 1;
        while(i < j) {
            int tmp = Math.min(heights[i], heights[j]) * (j - i);
            if (tmp > res) {
                res = tmp;
            }

            if (heights[i] > heights[j]) {
                j--;
            } else {
                i++;
            }

        }
        return res;
    }
}
