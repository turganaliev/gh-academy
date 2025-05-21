package W16;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        int sum_subarray = 0;

        Map<Integer, Integer> prefixSums = new HashMap<>();

        prefixSums.put(0, 1);

        for (int num : nums){
            sum_subarray += num;

            if (prefixSums.containsKey(sum_subarray - k)) {
                ans += prefixSums.get(sum_subarray - k);
            }
            prefixSums.put(sum_subarray, prefixSums.getOrDefault(sum_subarray, 0) + 1);
        }
        return ans;
    }
}
