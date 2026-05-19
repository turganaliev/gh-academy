public class Solution {
    public int veryEasyProblem(int n, int x, int y) {
        if (n == 1) {
            return Math.min(x, y);
        }
        n--;

        long l = 0;
        long r = (long) n * Math.max(x, y);
        long ans = r;

        while (l <= r) {
            long middle = l + (r - l) / 2;
            if (middle / x + middle / y >= n) {
                ans = middle;
                r = middle - 1;
            } else l = middle + 1;
        }
        return (int) (Math.min(x, y) + ans);
    }
}