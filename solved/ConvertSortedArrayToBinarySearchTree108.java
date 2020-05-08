import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class ConvertSortedArrayToBinarySearchTree108{
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
    }
    
    static TreeNode sortedArrayToBST(int[] nums) {
        // TreeNode result = new TreeNode(nums[nums.length/2]);
        // return result;
        
        //recursive
        return helper(nums, 0, nums.length - 1);
    }

    private static TreeNode helper(int[] nums, int l, int r) {
        if (l>r) return null;
        int mid = (l+r)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, l, mid-1);
        root.right = helper(nums, mid+1, r);
        return root;
      }
}
