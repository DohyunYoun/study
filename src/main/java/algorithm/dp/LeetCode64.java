package algorithm.dp;

//https://leetcode.com/problems/minimum-path-sum/
public class LeetCode64 {
    public static void main(String[] args) {

        int[][] input = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        minPathSum(input);
    }

    public static int minPathSum(int[][] grid) {
        int leni = grid.length;
        int lenj = grid[0].length;
        for (int i = 0; i < leni; i++) {
            for (int j = 0; j < lenj; j++) {
                if (i == 0 && j == 0)
                    continue;
                if (i == 0) {
                    //left
                    grid[i][j] += grid[i][j - 1] ;
                } else if (j == 0) {
                    //top
                    grid[i][j] += grid[i - 1][j] ;
                } else {
                    grid[i][j] += Math.min(grid[i][j - 1] , grid[i - 1][j] );
                }
            }
        }
        return grid[leni - 1][lenj - 1];
    }
}
