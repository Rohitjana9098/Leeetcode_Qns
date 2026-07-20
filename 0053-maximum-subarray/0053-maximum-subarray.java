class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = nums[0];
        int current_sum = nums[0];
        int n = nums.length;
        for(int i = 1; i < n ; i++) {
            current_sum = Math.max(nums[i],current_sum + nums[i]);
            max_sum = Math.max(current_sum,max_sum);
        }
        return max_sum;
    }
}