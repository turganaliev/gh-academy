class Solution {
    public int removeDuplicates(int[] nums) {
        int val = nums[0]; int pos = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[pos++] = nums[i];
                val = nums[i];
            }
        }
        return pos;
    }
}