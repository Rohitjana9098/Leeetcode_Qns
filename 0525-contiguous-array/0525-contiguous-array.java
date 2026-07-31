class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int max_len = 0;
        int running_sum = 0;
        for(int i = 0 ; i < nums.length ; i ++) {
        // Treat 1 as +1 and 0 as -1
        running_sum += (nums[i] == 1) ? 1 : -1;
        if(map.containsKey(running_sum)) {
           max_len = Math.max(max_len,i - map.get(running_sum));
        } else {
            map.put(running_sum, i);
        }
        }
        return max_len;
    }
}