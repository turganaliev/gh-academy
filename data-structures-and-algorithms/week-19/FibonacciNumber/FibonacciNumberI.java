// Approach #1
class Solution {
    int[] memo;

    private int fib_(int n) {
        if (n <= 1) return n;
        if (memo[n] == 0) memo[n] = fib_(n - 1) + fib_(n - 2);
        return memo[n];
    }

    public int fib(int n) {
        memo = new int[n + 1];
        return fib_(n);
    }
}