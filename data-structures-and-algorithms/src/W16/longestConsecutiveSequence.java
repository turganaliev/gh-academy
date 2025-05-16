package W16;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest_streak = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int start_streak = num;
                int end_streak = num;

                while (set.contains(end_streak + 1)) {
                    end_streak++;
                }
                longest_streak = Math.max(longest_streak, end_streak - start_streak + 1);
            }
        }
        return longest_streak;
    }
}
