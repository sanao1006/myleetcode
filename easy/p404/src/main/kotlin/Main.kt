package com.api

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun sumOfLeftLeaves(root: TreeNode?): Int {
        if (root == null) return 0

        val leftSum = if (isLeaf(root.left)) root.left!!.`val` else sumOfLeftLeaves(root.left)
        return leftSum + sumOfLeftLeaves(root.right)
    }

    private fun isLeaf(node: TreeNode?): Boolean = node != null && node.left == null && node.right == null
}