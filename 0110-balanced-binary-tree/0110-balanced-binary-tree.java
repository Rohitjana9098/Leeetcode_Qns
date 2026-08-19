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
    public boolean isBalanced(TreeNode root) {
        return helper(root) != -1;
    }
    private int helper(TreeNode root) {
        if (root == null) return 0;
        int leftheight = helper(root.left);
        if(leftheight == -1) return -1; // unblanced 
        int rightheight = helper(root.right);
        if(rightheight == -1) return -1; // unbalanced

        if(Math.abs(leftheight - rightheight) > 1) {
            return -1;
        }
        return 1 + Math.max(leftheight,rightheight);
    }
}