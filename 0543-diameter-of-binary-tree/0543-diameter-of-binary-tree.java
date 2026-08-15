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
    int max_dipt = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        max_dipt = 0;
        helper(root);
        return max_dipt;
    }
    private int helper(TreeNode node) {
        if(node == null) {
            return 0;
        }
        int left_high = helper(node.left);
        int right_high = helper(node.right);
        max_dipt = Math.max(max_dipt,left_high + right_high);
        return 1 + Math.max(left_high,right_high);
    }
}