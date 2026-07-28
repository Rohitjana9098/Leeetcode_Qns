class Solution {
    public int[] runningSum(int[] nums) {
        // Start from index 1 since nums[0] is already its own running sum
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}