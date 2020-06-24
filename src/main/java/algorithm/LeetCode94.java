package algorithm;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode94 {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(2, a, null);
        TreeNode c = new TreeNode(1, null, b);
//        inorderTraversal(c);
    }


    static class TreeNode {
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
//Iterator
   static public List<Integer> inorderTraversalIterative(TreeNode root) {

        List<Integer> ans = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        while (node != null || stack.size() > 0) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                ans.add(node.val);
                node = node.right;
            }
        }
        return ans;
    }

    //재귀
    static List<Integer> ans = new ArrayList<>();

    static public void inorderTraversal(TreeNode root) {
        if (root == null) return;
        inorderTraversal(root.left);
        ans.add(root.val);
        inorderTraversal(root.right);
    }

    /**
     * 추가
     */
    public void preorderTraversal(TreeNode root) {
        if (root == null) return;
        ans.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    static public void postorderTraversal(TreeNode root) {
        if (root == null) return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        ans.add(root.val);
    }

   static public void preOrderIterative(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while(node != null || stack.size() > 0){
            if(node!=null){
                ans.add(node.val);
                stack.push(node.right);
                node = node.left;

            }else{
                node = stack.pop();
            }
        }

       /**
        * SOLUTION OPTIMIZE
        */
//       List<Integer> ret = new ArrayList<Integer>();
//       if(root == null) return ret;
//       Deque<TreeNode> stack = new LinkedList<TreeNode>();
//       stack.push(root);
//       while (!stack.isEmpty()) {
//           TreeNode node = stack.pop();
//           ret.add(node.val);
//           if(node.right != null) stack.push(node.right);
//           if(node.left != null) stack.push(node.left);
//       }
//       return ret;
   }
    public List<Integer> preorderTraversalIterative(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.empty()){
            root = stack.pop();
            list.add(root.val);
            if(root.right != null) stack.push(root.right);
            if(root.left != null) stack.push(root.left);
        }
        return list;
    }

    public List<Integer> postorderTraversalIterative(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.empty()){
            root = stack.pop();
            list.add(0, root.val);
            if(root.left != null) stack.push(root.left);
            if(root.right != null) stack.push(root.right);
        }
        return list;
    }
}
