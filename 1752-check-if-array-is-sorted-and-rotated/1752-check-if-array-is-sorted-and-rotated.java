class Solution {
    private int countDrops(int[] nums,int i ,int n) {
        if(i == n -1) {
            return (nums[n-1] > nums[0]) ? 1:0;
        }

        int currentdrop = (nums[i] > nums[i+1]) ? 1 : 0;

        return currentdrop + countDrops(nums,i+1,n);
    }
    public boolean check(int[] nums) {
        int n = nums.length;
        if(n <=1) return true;
        return countDrops(nums,0,n) <= 1;
    }
}