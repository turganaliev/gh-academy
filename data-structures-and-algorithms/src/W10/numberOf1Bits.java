package W10;

class Solution {
    public int hammingWeight(int n) {
        int ans = 0;
        for (int i = 0; i <= 30; i++) {
            int bitmask = 1 << i;
            if ((n & bitmask) > 0) {
                ans++;
            }
        } return ans;
    }
}