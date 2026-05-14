class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int sqrt = (int) Math.ceil(Math.sqrt(n));
        int[] maximums = new int[sqrt];
        Arrays.fill(maximums, Integer.MIN_VALUE);
        for (int i = 0; i < n; i++) {
            int block = i / sqrt;
            maximums[block] = Math.max(maximums[block], nums[i]);
        }

        int[] results = new int[n - k + 1];
        for (int i = 0; i + k - 1 < n; i++) {
            int l = i;
            int r = l + k - 1;
            int res = Integer.MIN_VALUE;
            for (int j = l; j <= r;) {
                if (j % sqrt == 0 && j + sqrt - 1 <= r) {
                    res = Math.max(maximums[j / sqrt], res);
                    j += sqrt;
                } else res = Math.max(res, nums[j++]);
            }
            results[i] = res;
        }
        return results;
    }
}