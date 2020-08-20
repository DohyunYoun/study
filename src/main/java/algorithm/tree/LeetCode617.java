package algorithm.tree;

public class LeetCode617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
         if(t1 == null) return t2;
         if(t2 == null) return t1;
        //root
        TreeNode result = new TreeNode(t1.val+t2.val);
        result.left = mergeTrees(t1.left, t2.left);
        result.right = mergeTrees(t1.right, t2.right);
        return result;
    }

    class TreeNode {
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
