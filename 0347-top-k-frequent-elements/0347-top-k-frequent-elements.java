class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count = new HashMap<>();
        for(int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        //Min heap
        PriorityQueue<Integer> heap = new PriorityQueue (
            (a,b) ->count.get(a) - count.get(b)
        );
        //step3
        for(int num : count.keySet()) {
            heap.add(num);
            if(heap.size() > k) {
                heap.poll();
            }
        }
        //step 4
        int[] result = new int[k];
        for(int i = 0; i < k ; i++) {
            result[i] = heap.poll();
        }
        return result;

    }
}