class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        while (low <= high) {

            int middle = low + (high - low ) / 2;
            System.out.println("middle > " + middle);

            if (nums[middle] == target) {
                return middle;
            }
            if (nums[middle] > target) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }

        }
        return -1;
    }
}
