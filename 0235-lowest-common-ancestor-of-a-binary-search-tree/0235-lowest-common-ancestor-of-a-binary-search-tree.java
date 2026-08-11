/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    private TreeNode ans = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val < q.val) {
            helper(root,p,q);
        } else {
            helper(root,q,p);
        }
        return ans;
    }
    private void helper(TreeNode root,TreeNode p , TreeNode q) {
        if(root == null) return;
        //case 1 
        if(root == p || root == q ) {
            ans = root;
            return;
        }
        //case 2
        if(root.val < p.val) {
            helper(root.right,p,q);
        }
        else if(root.val > q.val) {
            helper(root.left,p,q);
        } else {
            ans = root;
            return;
        }
    }
}