package W15;

class Solution {
    public int[] getModifiedArray(int length; int[][] updates) {
        int[] difference = new int[length];

        for (int[] update : updates) {
            int startIndex = update[0];
            int endIndex = update[1];
            int increment = update[2];

            difference[startIndex] += increment;

            if (endIndex + 1 < length) {
                difference[endIndex + 1] -= increment;
            }
        }
        for (int i = 1; i < length; i++) {
            difference[i] += difference[i - 1];
        }
        return difference;
    }
}