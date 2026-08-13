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
    public int minDiffInBST(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        
        // 1. Populate the list
        helper(root, result);
        
        // 2. Sort values
        Collections.sort(result);
        
        // 3. Find minimum difference across ALL adjacent pairs
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < result.size(); i++) {
            int diff = result.get(i) - result.get(i - 1);
            minDiff = Math.min(minDiff, diff);
        }
        
        return minDiff;
    }

    private void helper(TreeNode node, List<Integer> result) {
        if (node == null) return;
        result.add(node.val);
        helper(node.left, result);
        helper(node.right, result);
    }
}