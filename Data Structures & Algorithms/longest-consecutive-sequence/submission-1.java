class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        int res = 1;
        int tmp = 1;

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i] - 1)) {
                int curr = nums[i];
                while (set.contains(++curr)) {
                    tmp++;
                }
            }
            if (tmp >= res) {
                res = tmp;
            }
            tmp = 1;
        }
        return res;
    }
}
