class Solution {
    public int trap(int[] height) {
        int l = height[0];
        int r = height[height.length - 1];
        int i = 1;
        int j = height.length - 2;
        int count = 0;

        while (i <= j) {
            if (l < r) {
                if (l <= height[i]) l = height[i++];
                else count += l - height[i++];
            } else {
                if (r <= height[j]) r = height[j--];
                else count += r - height[j--];
            }
        }
        return count;
    }
}