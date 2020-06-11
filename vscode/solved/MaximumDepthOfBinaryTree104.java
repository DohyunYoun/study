package solved;
public class  MaximumDepthOfBinaryTree104{
    
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(9);
        TreeNode c = new TreeNode(20);
        TreeNode d = new TreeNode(15);
        TreeNode e = new TreeNode(7);
        a.left = b;
        a.right = c;
        c.left = d;
        c.right = e;
        maxDepth(a);

    }
    static int maxDepth(TreeNode root) {
        //DFS
        if(root==null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));

        //BFS Version
        // if(root == null) {
        //     return 0;
        // }
        
        // Stack<TreeNode> stack = new Stack<>();
        // Stack<Integer> value = new Stack<>();
        // stack.push(root);
        // value.push(1);
        // int max = 0;
        // while(!stack.isEmpty()) {
        //     TreeNode node = stack.pop();
        //     int temp = value.pop();
        //     max = Math.max(temp, max);
        //     if(node.left != null) {
        //         stack.push(node.left);
        //         value.push(temp+1);
        //     }
        //     if(node.right != null) {
        //         stack.push(node.right);
        //         value.push(temp+1);
        //     }
        // }
        // return max;
    }
}
