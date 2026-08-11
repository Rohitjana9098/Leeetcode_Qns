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
        ans = null;
        Helper(root,p,q);
        return ans;
    }
    private int Helper(TreeNode Node , TreeNode p , TreeNode q) {
      if(Node == null) return 0;
      int left = Helper(Node.left,p,q);
      int right = Helper(Node.right,p,q);

      int self = (Node == p || Node == q) ? 1 : 0;
      int total = self + left + right;

      if(total == 2 && ans == null) {
        ans = Node;
      }
      return total;
    }
}