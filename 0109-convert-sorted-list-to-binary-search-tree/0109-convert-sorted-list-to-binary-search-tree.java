/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        return helper(head,null);
    }
    public TreeNode helper(ListNode head,ListNode tail) {
        if(head == tail) return null;
        ListNode mid = find_mid(head,tail);
        TreeNode root = new TreeNode(mid.val);
        root.left = helper(head,mid);
        root.right = helper(mid.next,tail);
        return root;
    }
    public ListNode find_mid(ListNode head,ListNode tail) {
        ListNode fast= head;
        ListNode slow = head;
        while(fast!=tail && fast.next!= tail) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}