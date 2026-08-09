class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root); 
        
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> Temp = new ArrayList<>(); 
            
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                Temp.add(node.val);
                
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            ans.add(Temp);
        } 
        
        // Reverse the list in-place first
        Collections.reverse(ans);
        
        // Then return it
        return ans;
    }
}