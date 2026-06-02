class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, 0, 0, "", n);
        return res;
    }
    private void backtrack(List<String> res, int open, int close, String s, int n) {
        if (s.length() == n * 2) {
            res.add(s);
            return;
        }
        if (open < n) backtrack(res, open + 1, close, s + '(', n);
        if (open > close) backtrack(res, open, close + 1, s + ')', n);
    }
}