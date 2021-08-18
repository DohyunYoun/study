package algorithm.tree

import algorithm.helperclass.TreeNode

class LeetCode1448 {
    /*
    var count = 0
    fun goodNodes(root: TreeNode?): Int {
        root?.let {
            search(it, it.`val`)
        }
        return count
    }

    fun search(node: TreeNode, max: Int) {
        val m = Math.max(node.`val`, max)
        if (m == node.`val`) {
            count++
        }
        node.left?.let { search(it, m) }
        node.right?.let { search(it, m) }
    }
     */
    fun goodNodes(root: TreeNode?): Int {
        return search(root, root?.`val`)
    }

    fun search(node: TreeNode?, max: Int?): Int {
        if (node == null) return 0
        val m = Math.max(node.`val`, max!!)
        return (if (m == node.`val`) 1 else 0) + search(node.left, m) + search(node.right, m)
    }
}