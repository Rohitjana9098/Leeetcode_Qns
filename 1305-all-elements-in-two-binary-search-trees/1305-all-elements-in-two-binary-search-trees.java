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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        Inorder(root1,arr1);
        Inorder(root2,arr2);
        
        return merge(arr1,arr2);

    }
    public void Inorder(TreeNode root,List<Integer> arr) {
         if(root == null) return;
         Inorder(root.left,arr);
         arr.add(root.val);
         Inorder(root.right,arr);
    }
    public List<Integer> merge(List<Integer> L1,List<Integer> L2) {
        List<Integer> merged = new ArrayList<>();
        int i = 0 , j = 0;
        while(i < L1.size() && j < L2.size()) {
            if(L1.get(i) <= L2.get(j)) {
                merged.add(L1.get(i++));
            } else {
                merged.add(L2.get(j++));
            }
        }
        while(i < L1.size()) merged.add(L1.get(i++));
        while(j < L2.size()) merged.add(L2.get(j++));
        return merged;
    }
    
}