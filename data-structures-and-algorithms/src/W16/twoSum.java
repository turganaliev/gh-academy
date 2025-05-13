package W16;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> NumMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int complement = target - current;

            if (NumMap.containsKey(complement)) {
                return new int[]{NumMap.get(complement), i};
            }
            NumMap.put(current, i);
        }
        return new int[]{};
    }
}
