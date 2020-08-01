package algorithm.tree;

public class LeetCode543 {
    //Diameter of Binary Tree
    //https://leetcode.com/problems/diameter-of-binary-tree/


    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private static int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }


    //dfs???
    private static int depth(TreeNode n) {
        if (n == null) return 0;
        int left = depth(n.left);
        int right = depth(n.right);
        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;

    }
}
