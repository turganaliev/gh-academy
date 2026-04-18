class Solution {
    public int removeDuplicates(int[] nums) {
        int pos = 0; int counter = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[pos]) {
                nums[++pos] = nums[i];
                counter = 0;
            } else {
                if (counter < 1) {
                    nums[++pos] = nums[i];
                    counter++;
                }
            }
        }
        return pos + 1;
    }
}