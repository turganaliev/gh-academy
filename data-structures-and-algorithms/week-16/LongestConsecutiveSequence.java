class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);

        int res = 0;
        for (int n : set) {
            if (!set.contains(n - 1)) {
                int left = n;
                int right = n;
                while (set.contains(right + 1)) right++;
                res = Math.max(res, right - left + 1);
            }
        }
        return res;
    }
}