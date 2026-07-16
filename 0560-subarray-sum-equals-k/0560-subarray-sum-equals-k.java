class Solution {
    public int subarraySum(int[] nums, int k) {
        int right = 0;
        int n = nums.length;
        int count = 0;
        for(int left = 0;left < n ; left++) {
            int sum = 0;
            for(right = left; right < n; right++ ) {
                sum = sum + nums[right];
                if(sum == k) {
                    count++;
                }
            }
        }
        return count;
    }


 }
