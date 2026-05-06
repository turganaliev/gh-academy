class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int red = 0;
        int blue = n - 1;
        int idx = 0;

        while (idx <= blue) {
            if (nums[idx] == 0) swap(nums, red++, idx++);
            else if (nums[idx] == 2) swap(nums, blue--, idx);
            else idx++;
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}