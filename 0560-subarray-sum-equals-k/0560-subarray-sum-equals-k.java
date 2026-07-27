import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        // Initialize map with prefix sum 0 having frequency 1
        map.put(0, 1);
        
        int count = 0;
        int prefixSum = 0;
        
        for (int num : nums) {
            prefixSum += num;
            
            // Check if (prefixSum - k) exists in the map
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }
            
            // Store / update the frequency of the current prefixSum
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        
        return count;
    }
}