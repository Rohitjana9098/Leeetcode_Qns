class Solution {
    public void moveZeroes(int[] nums) {
        int value = 0; 
        for(int i = 0; i < nums.length;i++) {
           if(nums[i] != 0) {
            nums[value] = nums[i];
            value++;
           }
        }
        for(int j = value; j < nums.length;j++) {
           nums[j] = 0;
        }
    }
}