class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int len = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                set.remove(c);
                len += 2;
            } else set.add(c);
        }
        return set.isEmpty() ? len : len + 1;
    }
}