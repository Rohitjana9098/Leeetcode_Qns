class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int high = 0;
        int low = 1;
        for(int num : nums) {
            high = Math.max(high , num);
        }
        int result = high;
        while(low <= high) {
           int mid = low + (high - low) / 2;
           if(helper(nums,mid) <= threshold ) {
              result = mid;
              high = mid -1;
           } else {
            low = mid +1;
           }
        } 
        return result;
    }
    public int helper(int[] nums, int devisor) {
        int sum = 0;
        for(int num : nums) {
            sum = sum + (num + devisor -1) / devisor;
        }
        return sum;
    }
    
}