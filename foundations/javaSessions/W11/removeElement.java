package W11;

class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int n = nums.length - 1;

        for (int i = 0; i <= n; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}