package algorithm.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode863 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }



    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        List<Integer> result = new ArrayList<>();

        if (K == 0)
            result.add(target.val);
        else
            dfs(result,root, target, K, 0);
        return result;
    }

    int dfs(List<Integer> result,TreeNode node, TreeNode target, int k, int depth) {
        if (node == null) return 0;
        if (depth == k) {
            result.add(node.val);
            return 0;
        }

        int left, right;
        if (node == target || depth > 0) {
            //target을 만난 적이 있음!
            left = dfs(result,node.left, target, k, depth+1);
            right = dfs(result,node.right, target, k, depth+1);
        } else {
            left = dfs(result,node.left, target, k, depth);
            right = dfs(result,node.right, target, k, depth);
        }

        if (node == target) return 1;

        if (left == k || right == k) {
            result.add(node.val);
            return 0;
        }

        if (left > 0) {
            dfs(result,node.right, target, k, left+1);
            return left+1;
        }
        if (right > 0) {
            dfs(result,node.left, target, k, right+1);
            return right+1;
        }
        return 0;
    }
}
