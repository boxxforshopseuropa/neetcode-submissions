class Solution {
    public int trap(int[] height) {
        if (height.length <= 1) {
            return 0;
        }
        int res = 0;
        int left = 1;
        int right = height.length - 2;
        int lmax = height[left - 1], rmax = height[right + 1];
        while (left <= right) {

            if (rmax <= lmax) {
                res += Math.max(0, rmax - height[right]);
                rmax = Math.max(rmax, height[right]);
                right--;
            } else {
                res += Math.max(0, lmax - height[left]);
                lmax = Math.max(lmax, height[left]);
                left++;
            }
        }
        return res;
    }
}
