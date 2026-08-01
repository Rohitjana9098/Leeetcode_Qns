class Solution {
    public int[] leftRightDifference(int[] nums) {
        int total_sum = 0 ;
        int[] answer = new int[nums.length];
        
        int left_sum = 0;
   
        for(int num : nums) {
            total_sum = total_sum + num;
        }
        for(int i = 0; i < nums.length;i++) {
            int right_sum = total_sum - left_sum - nums[i];
            answer[i] = Math.abs(left_sum - right_sum);
            left_sum = left_sum + nums[i];
        }
        return answer;
    }
}