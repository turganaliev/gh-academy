package W14;

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                int temp = nums[count];
                nums[count++] = nums[i];
                nums[i] = temp;
            }
        }

        for (int i = count; i < n; i++) {
            if (nums[i] == 1) {
                int temp = nums[count];
                nums[count++] = nums[i];
                nums[i] = temp;
            }
        }
    }
}
