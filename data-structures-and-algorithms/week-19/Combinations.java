class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        func(list, new ArrayList<>(), n, k, 0);
        return list;
    }
    private void func(List<List<Integer>> list, List<Integer> temp, int n, int k, int start) {
        if (temp.size() == k) {
            list.add(new ArrayList<>(temp));
            return;
        }
        for (int j = start; j < n; j++) {
            temp.add(j + 1);
            func(list, temp, n, k, j + 1);
            temp.remove(temp.size() - 1);
        }
    }
}