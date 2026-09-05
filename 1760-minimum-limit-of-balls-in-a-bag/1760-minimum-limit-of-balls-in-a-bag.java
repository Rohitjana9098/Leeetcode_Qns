class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
    
        int low = 1;
        int high = 0;
        
        for (int num : nums) {
            high = Math.max(high, num);
        }
        
        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Check feasibility using the helper function
            if (canDivide(nums, maxOperations, mid)) {
                ans = mid;        
                high = mid - 1;
            } else {
                low = mid + 1;    
            }
        }

        return ans;
    }
    private boolean canDivide(int[] nums, int maxOperations, int maxSize) {
        long opsNeeded = 0;
        for(int num : nums) {
            opsNeeded += (num - 1) / maxSize;
            if (opsNeeded > maxOperations) {
                return false; // Early exit optimization
            }
        }
        return opsNeeded <= maxOperations;
    }
}