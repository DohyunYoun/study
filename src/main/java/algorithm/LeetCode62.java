package algorithm;

import java.util.ArrayDeque;
import java.util.Queue;

public class LeetCode62 {
    //https://leetcode.com/problems/unique-paths/discuss/23154/6-lines-java-0ms-solution
    //https://leetcode.com/problems/unique-paths/discuss/184248/8-lines-Java-DP-solution-0ms-beats-100-explained-with-graph
    public int uniquePaths(int m, int n) {

        boolean[][] visited = new boolean[m][n];
//        int[][] grid = new int[m][n];
        int[] dx = {0,1};
        int[] dy = {1,0};
        int path = 0;
        //start
        visited[0][0] = true;

        return 0;
    }
    void bfs(boolean start){
        Queue<Boolean> queue = new ArrayDeque<>();
        queue.offer(start);
        while(!queue.isEmpty()){
            boolean visit = queue.poll();
            for(int i = 0 ; i < 2 ; i ++){

            }
        }

    }
}
