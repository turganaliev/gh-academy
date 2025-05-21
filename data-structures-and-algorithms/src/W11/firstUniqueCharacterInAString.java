package W11;

class Solution {
    public int firstUniqChar(String s) {
        int charArray[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char k = s.charAt(i);
            charArray[k - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            char k = s.charAt(i);
            if (charArray[k - 'a'] == 1) {
                return i;
            }
        }
        return - 1;
    }
}
