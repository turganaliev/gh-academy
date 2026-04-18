class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int equalToPivot = 0;
        int insertPos = 0;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) res[insertPos++] = nums[i];
            else if (nums[i] == pivot) equalToPivot++;
        }
        while (equalToPivot > 0) {
            res[insertPos++] = pivot;
            equalToPivot--;
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > pivot) res[insertPos++] = nums[i];
        }
        return res;
    }
}