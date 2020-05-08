  class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


public class SymmetricTree101{
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
    }
    
    static boolean isSymmetric(TreeNode root) {
        return root== null || symemetricHelp(root.left, root.right);
    }
    
    static  boolean symemetricHelp(TreeNode left, TreeNode right){
        if(left == null || right == null){
            return left == right;
        }
        return symemetricHelp(left.left, right.right) && symemetricHelp(left.right, right.left);
    }
}
