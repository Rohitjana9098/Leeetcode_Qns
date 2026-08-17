/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        // Initially, the root can take any value, so boundaries are (-infinity, +infinity).
        // Using Long.MIN_VALUE and Long.MAX_VALUE handles edge cases where node values equal Integer.MIN_VALUE or Integer.MAX_VALUE.
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean valid(TreeNode node, long left, long right) {
        // An empty node/tree is a valid BST
        if (node == null) {
            return true;
        }

        // The current node value must strictly be within (left, right) boundaries
        if (!(node.val > left && node.val < right)) {
            return false;
        }

        // Recursively check left and right subtrees:
        // - For left child: upper bound updates to node.val (must be less than current node)
        // - For right child: lower bound updates to node.val (must be greater than current node)
        return valid(node.left, left, node.val) && valid(node.right, node.val, right);
    }
}