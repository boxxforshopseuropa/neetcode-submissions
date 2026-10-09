class Solution {
    public int largestRectangleArea(int[] heights) {
        heights = Arrays.copyOf(heights, heights.length + 1);
        int res = 0;
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < n; i++) {
            while (stack.peek() != -1 && heights[stack.peek()] > heights[i]) {
                int h = heights[stack.pop()];
                int w = i - stack.peek() - 1;
                res = Math.max(res, h*w);
            }
            stack.push(i);
        }
        return res;
    }
}
