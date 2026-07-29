class Solution {
    public int waysToSplitArray(int[] nums) {
        long total_sum = 0;
        int count = 0;
        for(int num : nums) {
           total_sum = total_sum + num;
        }
        long left_sum = 0 ; 
        
        for(int i = 0 ; i < nums.length-1; i++) {
            left_sum = left_sum + nums[i];
            long right_sum = total_sum - left_sum;
            if (left_sum >= right_sum) {
                count++;
            }
        }
        return count;
    }
}