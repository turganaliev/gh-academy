package W12;

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] result = new int[n];
        int insertAt = 0;
        int freqCalc = 0;

        for (int num : nums){
            if(num < pivot){
                result[insertAt++] = num;
            } else if(num == pivot){
                freqCalc++;
            }
        }

        while (freqCalc > 0){
            result[insertAt++] = pivot;
            freqCalc--;
        }

        for (int num : nums){
            if(num > pivot) {
                result[insertAt++] = num;
            }
        }
        return result;
    }
}
