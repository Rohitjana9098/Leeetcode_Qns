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
    int max_path_sum;
    public int maxPathSum(TreeNode root) {
        max_path_sum = Integer.MIN_VALUE;;
        helper(root);
        return max_path_sum;
    }
    public int helper(TreeNode root){
        if(root == null) {
            return 0;
        }
        int left_sum = Math.max(0,helper(root.left));
        int right_sum = Math.max(0,helper(root.right));
        int curr_sum = root.val + left_sum + right_sum;
        max_path_sum = Math.max(max_path_sum,curr_sum);
        return root.val + Math.max(left_sum,right_sum);
    }
}