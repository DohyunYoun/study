package algorithm.tree

import algorithm.helperclass.TreeNode

class LeetCode669 {
    fun trimBST(root: TreeNode?, low: Int, high: Int): TreeNode? {
        traverse(root,low,high)
        return  root
    }

    fun traverse(root: TreeNode?, low: Int, high: Int) {
        var node: TreeNode? = root?: return
        if (node == null) {
            return
        }

        if(node.`val` < low) {
            node = node.right
            traverse(node, low, high)
        } else if (node.`val` > high) {
            node = node.left
            traverse(node, low, high)
        } else {
            node.left?.let { traverse(it, low, high) }
            node.right?.let { traverse(it, low, high) }
        }
    }

}