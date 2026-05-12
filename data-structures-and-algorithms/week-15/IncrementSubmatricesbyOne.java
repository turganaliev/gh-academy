class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] matrix = new int[n][n];

        for (int[] query : queries) {
            int r1 = query[0];
            int c1 = query[1];
            int r2 = query[2];
            int c2 = query[3];

            matrix[r1][c1] += 1;
            if (c2 + 1 < n) matrix[r1][c2 + 1] -= 1;
            if (r2 + 1 < n) matrix[r2 + 1][c1] -= 1;
            if (r2 + 1 < n && c2 + 1 < n) matrix[r2 + 1][c2 + 1] += 1;
        }
        for (int row = 0; row < n; row++) {
            int col = 1;
            while (col < n) {
                matrix[row][col] += matrix[row][col - 1];
                col++;
            }
        }
        for (int col = 0; col < n; col++) {
            int row = 1;
            while (row < n) {
                matrix[row][col] += matrix[row - 1][col];
                row++;
            }
        }
        return matrix;
    }
}