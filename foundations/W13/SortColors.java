class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int blue = nums.length - 1;
        int i = 0;

        while (i <= blue) {
            if (nums[i] == 0) swap(nums, i++, red++);
            else if (nums[i] == 1) i++;
            else swap(nums, i, blue--);
        }
    }
    private void swap(int[] nums, int low, int high) {
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }
}