class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix.length == 0 || matrix[0].length == 0) return ans;

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (true) {
            for (int i = left; i <= right; i++) ans.add(matrix[top][i]);
            if (++top > bottom) break;
            for (int i = top; i <= bottom; i++) ans.add(matrix[i][right]);
            if (--right < left) break;
            for (int i = right; i >= left; i--) ans.add(matrix[bottom][i]);
            if (--bottom < top) break;
            for (int i = bottom; i >= top; i--) ans.add(matrix[i][left]);
            if (++left > right) break;
        }
        return ans;
    }
}