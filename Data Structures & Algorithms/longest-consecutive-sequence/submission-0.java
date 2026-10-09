class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        nums = set.stream().mapToInt(Number::intValue).toArray();
        Arrays.sort(nums);
        int res = 0;
        int tmp = 1;
        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(nums[i]-nums[i-1]) == 1) {
                tmp++;
            } else {
                if (tmp >= res) {
                    res = tmp;
                }
                tmp = 1;
            }
        }
        return Math.max(tmp, res);
    }
}
