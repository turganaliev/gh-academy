class Solution {
    public int shipWithinDays(int[] weights, int D) {
        int l = 0;
        int r = 0;
        int res = -1;
        for (int w : weights) {
            l = Math.max(l, w);
            r += w;
        }

        while (l <= r) {
            int middle = (l + r) / 2;
            int days = 1;
            int cur = 0;
            for (int w : weights) {
                if (cur + w > middle) {
                    days++;
                    cur = w;
                } else cur += w;
            }
            if (days <= D) {
                res = middle;
                r = middle - 1;
            }
            else l = middle + 1;
        }
        return res;
    }
}