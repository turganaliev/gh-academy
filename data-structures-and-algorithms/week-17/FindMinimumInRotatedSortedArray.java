class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        if (n == 1 || nums[0] < nums[n - 1]) return nums[0];

        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (middle > 0 && nums[middle] < nums[middle - 1]) return nums[middle];
            else if (nums[middle] < nums[right]) right = middle - 1;
            else left = middle + 1;
        }
        return -1;
    }
}