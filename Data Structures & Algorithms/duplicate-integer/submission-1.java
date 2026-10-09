class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums != null && nums.length <= 1) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 1);
        for (int i = 1; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                return true;
            } else {
                map.put(nums[i], 1);
            }
        }
        return false;
    }
}