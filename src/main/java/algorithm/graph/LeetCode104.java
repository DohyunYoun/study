package algorithm.graph;

public class LeetCode104 {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(9);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);

        TreeNode node2 = new TreeNode(20, node3, node4);
        TreeNode root = new TreeNode(3, node1, node2);

        new LeetCode104().maxDepth(root);

    }


    int count = 0;
    void countDepth(TreeNode root, int depth){
        if(depth > count) count = depth;
      if(root.left!=null)  countDepth(root.left, depth++);
        if(root.right!=null)  countDepth(root.right, depth++);
    }
    public int maxDepth(TreeNode root) {
        countDepth(root,0);
        return count;
    }

    //0 ms	39.7 MB
    /*
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftMax = root.left != null ? maxDepth(root.left) : 0;
        int rightMax = root.right!=null ? maxDepth(root.right) : 0;
        return Math.max(leftMax, rightMax)+1;
    }
*/
    //0 ms	40.6 MB
    /*
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
*/
    /**
     * BFS
     * 	1 ms	39.2 MB
     */
    /*
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int depth = 0;
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.offer(root);
        while (!nodes.isEmpty()) {
            int size = nodes.size();
            depth++;
            while (size-- > 0) {
                TreeNode node = nodes.poll();
                if (node.left != null) nodes.offer(node.left);
                if (node.right != null) nodes.offer(node.right);
            }
        }
        return depth;
    }
*/
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        TreeNode(int x, TreeNode _left, TreeNode _right) {
            val = x;
            left = _left;
            right = _right;
        }
    }

}


