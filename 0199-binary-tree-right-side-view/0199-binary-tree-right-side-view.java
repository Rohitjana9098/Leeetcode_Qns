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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            TreeNode rightside = null;
            int Queue_Len = queue.size();

            for(int i = 0; i < Queue_Len; i ++) {
                TreeNode node = queue.poll();
                if(node != null) {
                    rightside = node;
                    queue.add(node.left);
                    queue.add(node.right);
                }
                
            }
            if (rightside != null) {
                result.add(rightside.val);
            }
        }
        return result;

    }
}