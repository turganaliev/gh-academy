package W13;

class Solution {
    public void sortColors(int[] nums) {
        int place = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 1) {
                int temp = nums[place];
                nums[place] = nums[i];
                nums[i] = temp;
                place++;
            }
        }

        for (int i = place; i < nums.length; i++) {
            if (nums[i] == 1) {
                int temp = nums[place];
                nums[place] = nums[i];
                nums[i] = temp;
                place++;
            }
        }
    }
}
