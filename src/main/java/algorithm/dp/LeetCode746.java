package algorithm.dp;

public class LeetCode746 {
    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(cost2) + "");
    }

    //1 ms	39.4 MB
    public static int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] dp = new int[len];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < len; i++) {
            dp[i] = Math.min(dp[i - 2], dp[i - 1]) + cost[i];
        }
        return Math.min(dp[len - 1], dp[len - 2]);
    }

    //SOLUTION 0 ms	38.8 MB
    public static int minCostClimbingStairs2(int[] cost) {
        int len = cost.length;
        for (int i = 2; i < len; i++) {
            cost[i] += Math.min(cost[i - 2], cost[i - 1]);
        }
        return Math.min(cost[len - 1], cost[len - 2]);
    }

    //SOLUTION 0 ms	39.1 MB
    //Space Complexcity : O(1)
    //Time Complexity : O(n)
    public static int minCostClimbingStairs3(int[] cost) {
        int firstBefore = cost[0];
        int secondBefore = cost[1];
        for (int i = 2, len = cost.length; i < len; i++) {
            int curr = Math.min(firstBefore, secondBefore) + cost[i];
            firstBefore = secondBefore;
            secondBefore = curr;
        }
        return Math.min(firstBefore, secondBefore);
    }
}
