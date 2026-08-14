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
    boolean result = false;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        result = false;
        helper(root, 0, targetSum);
        return result;
    }

    private void helper(TreeNode root, int curr_Sum, int targetSum) {
        if (root == null) return;
        
        curr_Sum += root.val;

        // Base case 2: Leaf node check
        if (root.left == null && root.right == null) {
            if (curr_Sum == targetSum) {
                result = true;
            }
            return;
        }

        helper(root.left, curr_Sum, targetSum);
        helper(root.right, curr_Sum, targetSum);
    }
}