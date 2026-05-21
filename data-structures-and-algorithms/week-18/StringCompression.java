class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        char temp = '0';
        int count = 0;
        int idx = 0;

        for (char c : chars) {
            if (c != temp) {
                if (count > 1) {
                    char[] digits = Integer.toString(count).toCharArray();
                    for (char d : digits) {
                        chars[idx++] = d;
                    }
                }
                chars[idx++] = c;
                temp = c;
                count = 1;
            } else {
                count++;
            }
        }
        if (count > 1) {
            char[] digits = Integer.toString(count).toCharArray();
            for (char d : digits) {
                chars[idx++] = d;
            }
        }
        return idx;
    }
}