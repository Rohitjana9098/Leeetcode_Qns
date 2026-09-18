class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        //build freq map
        for(String word : words) {
            map.put(word,map.getOrDefault(word,0)+1);
        }
        //bild heap
        PriorityQueue<String> Heap = new PriorityQueue<>(
            (a,b) -> {
                if(!map.get(a).equals(map.get(b))){
                    return map.get(a) - map.get(b);
                } else {
                    return b.compareTo(a);
                }
            }
        );
        for(String word:map.keySet()) {
            Heap.offer(word); //
            if(Heap.size() > k) {
                Heap.poll();
            }
        }
        // string to array list 
        List<String> result = new ArrayList<>();
        while(!Heap.isEmpty()) {
            result.add(Heap.poll());
        }
        Collections.reverse(result);
        return result;

    }
}