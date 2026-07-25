class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       int total_Sum = 0;
       int currMax= 0;
       int Max_Sum = nums[0]; 

       int currMin = 0;
       int Min_Sum = nums[0];
       for(int num : nums) {
        total_Sum += num;
        //kadanes algo for max sum 
        currMax = Math.max(num,currMax+num);
        Max_Sum = Math.max(Max_Sum,currMax);
        //kadanes algo for min sum 
        currMin = Math.min(num,currMin+num);
        Min_Sum = Math.min(Min_Sum,currMin);
       }
       if(Max_Sum < 0) {
        return Max_Sum;
       }
       return Math.max(Max_Sum, total_Sum - Min_Sum);
    }
}