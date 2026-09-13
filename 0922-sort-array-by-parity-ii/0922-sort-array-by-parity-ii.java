class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int left = 0; 
        int right = 1;
        int n = nums.length;
        while(left < n && right < n) {
            if(nums[left] % 2 == 0) {
                left = left+2;
            } else if (nums[right] % 2 != 0) {
                right = right + 2;
            } else {
                swap(nums,left,right);
                left = left + 2;
                right = right + 2;
            }
        }
        return nums;
    }
    private void swap(int[] nums,int left,int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}