class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int res = -1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if ((long) middle * middle <= x) {
                res = middle;
                left = middle + 1;
            } else right = middle - 1;
        }
        return res;
    }
}