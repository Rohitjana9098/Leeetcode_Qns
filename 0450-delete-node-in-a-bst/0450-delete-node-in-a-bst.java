class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        return helper(root, key);
    }

    private TreeNode helper(TreeNode root, int key) {

        if (root == null) return null;

        if (key < root.val) {
            root.left = helper(root.left, key);
        }
        else if (key > root.val) {
            root.right = helper(root.right, key);
        }
        else {
            // We found the node to delete

            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }

            // Both children exist
            // Find inorder successor
            TreeNode successor = root.right;

            while (successor.left != null) {
                successor = successor.left;
            }

            root.val = successor.val;

            root.right = helper(root.right, successor.val);
        }

        return root;
    }
}