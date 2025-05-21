package W12;

class Solution {
    public void moveZeroes(int[] nums) {
        int pos = 0;

        for (int left : nums) {
            if (left != 0) nums[pos++] = left;
        }
        while (pos < nums.length) {
            nums[pos++] = 0;
        }
    }
}