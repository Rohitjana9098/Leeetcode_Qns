import java.util.PriorityQueue;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        // Min-Heap ordered by node value
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Add the head node of each non-empty list to the heap
        for (ListNode list : lists) {
            if (list != null) {
                minHeap.add(list);
            }
        }

        // Dummy node to simplify head node insertion
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        // Process nodes until the heap is empty
        while (!minHeap.isEmpty()) {
            // Get the node with the smallest value
            ListNode node = minHeap.poll();
            curr.next = node;
            curr = curr.next;

            // If this node has a next node, push it into the heap
            if (node.next != null) {
                minHeap.add(node.next);
            }
        }

        return dummy.next;
    }
}