class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;

        while (l <= r) {
            int diff = r - l;
            if (height[l] < height[r]) max = Math.max(max, height[l++] * diff);
            else max = Math.max(max, height[r--] * diff);
        }
        return max;
    }
}