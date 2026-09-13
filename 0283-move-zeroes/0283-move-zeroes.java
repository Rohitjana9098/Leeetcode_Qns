class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0; // Write pointer for non-zero elements

        // Phase 1: Overwrite non-zero values into index i
        for (int read = 0; read < nums.length; read++) {
            if (nums[read] != 0) {
                nums[i] = nums[read];
                i++;
            }
        }

        // Phase 2: Fill remaining positions from index i to the end with 0
        for (int j = i; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}