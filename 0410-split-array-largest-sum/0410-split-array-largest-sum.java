class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        if(k > n) return -1;
        int low = nums[0]; 
        int high = 0;
        int result = -1;
        for(int num : nums) {
            if(low < num) {
                low = num;
            }
            high += num;
        }
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(Helper(nums,k,mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
    private boolean Helper(int[] nums, int k,int large_sum) {
        int m = 1;
        int curr_sum = 0;
        for(int num : nums) {
           if(curr_sum + num > large_sum) {
            m++;
            curr_sum = num;
        } else {
           curr_sum+= num;
        }
        }
        return m <= k;
    }
}