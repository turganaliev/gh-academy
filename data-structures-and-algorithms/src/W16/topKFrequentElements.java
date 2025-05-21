package W16;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Pair<Integer, Integer>> sorted_pairs = new ArrayList<>();
        for (var entry : map.entrySet()) {
            Pair<Integer, Integer> freq_pair = new Pair<>(entry.getKey(), entry.getValue());
            sorted_pairs.add(freq_pair);
        }

        Collections.sort(sorted_pairs, (fp1, fp2) -> {
            return fp2.getValue() - fp1.getValue();
        });

        int[] results = new int[k];
        for (int i = 0; i < k; i++) {
            results[i] = sorted_pairs.get(i).getKey();
        }
        return results;
    }
}
