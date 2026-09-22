import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public String reorganizeString(String s) {
        // Step 1: Count frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Build a Max-Heap based on character counts
        // Sorting entries by frequency in descending order
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = 
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        
        maxHeap.addAll(freqMap.entrySet());

        StringBuilder result = new StringBuilder();
        Map.Entry<Character, Integer> prev = null;

        // Step 3: Process heap elements greedily
        while (!maxHeap.isEmpty() || prev != null) {
            // If heap is empty but we still have a held character, it's impossible
            if (maxHeap.isEmpty() && prev != null) {
                return "";
            }

            // Extract the most frequent character
            Map.Entry<Character, Integer> current = maxHeap.poll();
            result.append(current.getKey());
            current.setValue(current.getValue() - 1);

            // Push the previously held character back into the heap
            if (prev != null) {
                maxHeap.offer(prev);
                prev = null;
            }

            // Hold current character if it still has remaining frequency
            if (current.getValue() > 0) {
                prev = current;
            }
        }

        return result.toString();
    }
}