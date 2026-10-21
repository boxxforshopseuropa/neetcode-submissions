class Solution {
    public int search(int[] nums, int target) {
        int idx = nums.length/2;
        for (int i = 0; i < Math.log(nums.length); i++) {

            if (nums[idx] == target) {
                return idx;
            }
            if (nums[idx] > target) {
                idx -= Math.ceilDiv(idx,2);
            } else {
                idx +=  Math.ceilDiv(idx,2);
            }
        }
        return -1;
    }
}
