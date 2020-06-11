package solved;
import java.util.LinkedList;

//230
class TreeNode{
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; } 
}
public class KthSmallestBst{
  public static void main(String[] args) {
    System.out.println("Default Main Fuction Sample");
  }
  
  public int kthSmallest(TreeNode root, int k) {
    LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
    while (true) {
      while (root != null) {
        stack.add(root);
        root = root.left;
      }
      root = stack.removeLast();
      if (--k == 0) return root.val;
      root = root.right;
    }
  }
}
