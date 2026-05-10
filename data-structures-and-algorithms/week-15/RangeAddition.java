class Solution {
    public int[] rangeAddition(int length, int[][]updates) {
        int[] arr = new int[length];
        for (int[] update : updates) {
            arr[update[0]] += update[2];
            if (update[1] + 1 < length) {
                arr[update[1] + 1] -= update[2];
            }
        }
        for (int i = 1; i < length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }
}
