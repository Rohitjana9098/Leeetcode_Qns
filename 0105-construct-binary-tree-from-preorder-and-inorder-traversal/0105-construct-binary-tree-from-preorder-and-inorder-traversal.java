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
    private int  preIdx = 0;
    private Map<Integer,Integer> inorder_Map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0 ; i < inorder.length;i++) {
            inorder_Map.put(inorder[i], i);
        }
        return build(preorder, 0, inorder.length - 1);
        
    }
    public TreeNode build(int[] preorder,int inLeft,int inRight) {
       if(inLeft > inRight) return null;
       int rootval = preorder[preIdx++];
       TreeNode root = new TreeNode(rootval);
       int pivot = inorder_Map.get(root.val);
       root.left = build(preorder,inLeft,pivot - 1);
       root.right = build(preorder,pivot + 1,inRight);
       return root;
    }
}