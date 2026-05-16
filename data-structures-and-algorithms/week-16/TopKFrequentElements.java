class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) map.put(n, map.getOrDefault(n, 0) + 1);

        List<Pair<Integer, Integer>> pairs = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Pair<Integer, Integer> pair = new Pair<>(entry.getKey(), entry.getValue());
            pairs.add(pair);
        }
        pairs.sort((p1, p2) -> p2.getValue() - p1.getValue());

        int[] res = new int[k];
        for (int i = 0; i < k; i++) res[i] = pairs.get(i).getKey();

        return res;
    }
}