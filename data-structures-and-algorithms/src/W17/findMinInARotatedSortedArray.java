package W17;

class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        if (nums[0] < nums[n - 1]) return nums[0];

        int right = nums.length - 1;
        int left = 0;

        while (right >= left) {
            int mid = (right + left) / 2;
            if (mid > 0 && nums[mid] < nums[mid - 1]) return nums[mid];

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
