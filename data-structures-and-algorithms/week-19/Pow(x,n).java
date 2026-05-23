class Solution {
    public double myPow(double x, int n) {
        long exp = (long) n;
        if (exp < 0) x = 1 / x; exp = -exp;
        return myPow_(x, exp);
    }
    private double myPow_(double x, long exp) {
        if (exp == 0) return 1;
        if (exp % 2 == 0) return myPow_(x * x, exp / 2);
        else return myPow_(x * x, exp / 2) * x;
    }
}