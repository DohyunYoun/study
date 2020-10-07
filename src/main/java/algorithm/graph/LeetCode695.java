package algorithm.graph;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class LeetCode695 {
    /*

        int ROW;
        int COL;

        int maxNow = 0;
        int answer = 0;

        public int maxAreaOfIsland(int[][] grid) {
            ROW = grid.length;
            COL = grid[0].length;


            for (int i = 0; i < ROW; i++) {
                for (int j = 0; j < COL; j++) {
                    if (grid[i][j] == 1) {
                        maxNow = 0;
                        dfs(grid, i, j);
                    }
                }
            }

            return answer;

        }


        void dfs(int[][] grid, int x, int y) {
            if (x < 0 || y < 0 || x >= ROW || y >= COL || grid[x][y] != 1) return;
            grid[x][y] = 0;
            maxNow++;
            dfs(grid, x - 1, y);
            dfs(grid, x + 1, y);
            dfs(grid, x, y + 1);
            dfs(grid, x, y - 1);
            answer = Math.max(maxNow, answer)
            //cf SOLUTION
    //        return 1 + dfs(grid, i - 1, j) + dfs(grid, i + 1, j) + dfs(grid, i, j - 1) + dfs(grid, i, j + 1);
        }
    */
/*

    //SOLUTION 2
    private final static int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    int ROWS;
    int COLS;

    public int maxAreaOfIsland(int[][] grid) {
        ROWS = grid.length;
        COLS = grid[0].length;

        int answer = 0;
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (grid[i][j] == 1) {
                    answer = Math.max(answer, dfs(grid, i, j));
                }
            }
        }
        return answer;
    }

    private int dfs(int[][] grid, int x, int y) {
        if (x < 0 || y < 0 || x >= ROWS || y >= COLS || grid[x][y] != 1) return 0;
        //check visit
        grid[x][y] = 0;

        int maxNow = 1;
        for (int[] direction : directions) {
            int newX = x + direction[0];
            int newY = y + direction[1];
            maxNow += dfs(grid, newX, newY);
        }
        return maxNow;
    }


    private int bfs(int[][] grid, int x, int y) {
        if (grid[x][y] != 1) return 0;
        //check visit
        grid[x][y] = 0;

        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{x, y});
        int res = 1;
        while (!q.isEmpty()) {
            int[] pos = q.poll();
            for(int[] direction: directions){
                int newX = pos[0] + direction[0];
                int newY = pos[1] + direction[1];
                if(newX < 0 || newY < 0 || newX >= ROWS || newY >= COLS || grid[newX][newY]==0){
                    continue;
                }
                grid[newX][newY] = 0;
                res++;
                q.offer(new int[]{newX,newY});
            }
        }
        return res;
    }
*/
    int rows;
    int cols;

    public int maxAreaOfIsland(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;

        int answer = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                answer = Math.max(answer, dfs(grid, i, j));
            }
        }
        return answer;
    }

    int dfs(int[][] grid, int x, int y) {
        if (x < 0 || y < 0 || x >= rows || y >= cols || grid[x][y] == 0) return 0;
        grid[x][y] = 0;
        return 1 + dfs(grid, x + 1, y) + dfs(grid, x - 1, y) + dfs(grid, x, y - 1) + dfs(grid, x, y + 1);
    }
}
