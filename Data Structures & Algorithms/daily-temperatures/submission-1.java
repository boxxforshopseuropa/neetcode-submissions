class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
         int[] res = new int[temperatures.length];
        if (temperatures.length == 0) {
            return res;
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            int curr = temperatures[i];
            if (!stack.isEmpty() && curr > temperatures[stack.peek()]) {
                while (!stack.isEmpty() && temperatures[stack.peek()] < curr) {
                    Integer stackIndex = stack.peek();
                    res[stackIndex] = i - stackIndex;
                    stack.pop();
                }
            }
            stack.push(i);
        }

        return res;
    }
}
