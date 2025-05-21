package W17;

class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int left = 0;
        int right = x;
        int res = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid <= (long) x) {
                res = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        } return res;
    }
}