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
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode odd = head;             // Tracks the odd nodes
        ListNode even = head.next;       // Tracks the even nodes
        ListNode evenHead = even;        // Saves the start of the even list
        
        // Loop runs as long as there are even nodes to process
        while (even != null && even.next != null) {
            odd.next = even.next;        // Link current odd to the next odd node
            odd = odd.next;              // Move the odd pointer forward
            
            even.next = odd.next;        // Link current even to the next even node
            even = even.next;            // Move the even pointer forward
        }
        
        odd.next = evenHead;             // Connect the tail of odds to the head of evens
        return head;
    }
}