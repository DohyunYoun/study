package algorithm.graph;

import java.util.*;

//https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
//BFS
public class LeetCode107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();

        if (root == null) return wrapList;

        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for (int i = 0; i < levelNum; i++) {
                if (queue.peek().left != null) queue.offer(queue.peek().left);
                if (queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            wrapList.add(0, subList);
        }
        return wrapList;
    }

    /*
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return result;
        }
        List<Integer> r = new ArrayList<>();
        r.add(root.val);
        result.add(r);
        bfs(root,new ArrayList<>());
        Collections.reverse(result);
        return result;

    }

    void bfs(TreeNode root, List<Integer> node) {
     node = new ArrayList<>();
        if (root.left != null) node.add(root.left.val);
        if (root.right != null) node.add(root.right.val);
        if (!node.isEmpty()){
            result.add(node);
        }
        if (root.left != null) bfs(root.left);
        if (root.right != null) bfs(root.right);
    }
*/
    public class TreeNode {
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
}
