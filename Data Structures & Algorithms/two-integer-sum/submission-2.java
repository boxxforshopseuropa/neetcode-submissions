class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length < 2) {
            return new int[2];
        }

        Map<Integer, Integer> indxs = new HashMap<>(nums.length);

        for (int i = 1; i < nums.length; i++) {
            indxs.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int substract = target - nums[i];
            if (indxs.containsKey(substract) && indxs.get(substract) != i) {
                return new int[]{i, indxs.get(substract)};
            }
        }
        return new int[2];
    }
}
