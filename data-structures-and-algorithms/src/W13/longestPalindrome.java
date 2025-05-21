package W13;

class Solution {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) return 0;

        HashSet<Character> res = new HashSet<Character>();
        int length = 0;

        for (char c : s.toCharArray()) {
            if (res.contains(c)) {
                res.remove(c);
                length += 2;
            } else {
                res.add(c);
            }
        }
        if (!res.isEmpty()) length++;
        return length;
    }
}