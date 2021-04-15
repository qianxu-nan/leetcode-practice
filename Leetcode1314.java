class Solution1314 {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] dp = new int[m + 1][n + 1];
        int[][] res = new int[m][n];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + mat[i - 1][j - 1]
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int left = Math.max(0, j - k - 1);
                int right = Math.min(n, j + k);
                int up = Math.max(0, i - k - i);
                int down = Math.min(i + k, m);
                res[i - 1][j - 1] = dp[down][right] - dp[up][right] - dp[down][left] + dp[up][left];

            }
        }
    }
}
    public class Leetcode1314{
        public static void main(String[] args) {

        }
    }
