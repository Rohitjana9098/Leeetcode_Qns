class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> Heap = new PriorityQueue<>();

    // step 1 add elemnts in eap 
    for(int i = 0; i < k ; i++) {
        Heap.add(nums[i]);
    }
    //step 2 
    for(int i = k; i < nums.length;i++) {
        if(Heap.peek() < nums[i]) {
            Heap.poll();
            Heap.add(nums[i]);
        }
    }
    return Heap.peek();

    }
}