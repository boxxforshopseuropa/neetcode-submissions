class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        if (temperatures.length == 0) {
            return res;
        }
        int j;
        for (int i = 0; i < temperatures.length - 1; i++) {
            j = i + 1;
            int curr = temperatures[i];
            while (j < temperatures.length) {
                if (temperatures[j] <= curr) {
                    j++;
                } else {
                    res[i] = j-i;
                    break;
                }
            }
            if (j == temperatures.length) {
                res[i] = 0;
            }
        }
        res[temperatures.length-1] = 0;
        return res;
    }
}
