class Solution {
    public int findKthNumber(int m, int n, int k) {
        int l = 1;
        int r = m * n;
        int ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int count = func(mid, m, n);
            if (count < k) l = mid + 1;
            else {
                ans = mid;
                r = mid - 1;
            }
        }
        return ans;
    }
    private int func(int val, int m, int n) {
        int count = 0;
        for (int i = 1; i <= m; i++) {
            count += Math.min(n, val / i);
        }
        return count;
    }
}