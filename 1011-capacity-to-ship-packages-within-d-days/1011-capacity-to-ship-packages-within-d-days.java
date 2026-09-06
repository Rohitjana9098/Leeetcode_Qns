class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int weight : weights) {
           low = Math.max(low,weight);
           high += weight;
        }
        int ans = high;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            int reqday = helper(weights,mid); {
                if(reqday <= days) {
                    ans = mid;
                    high = mid -1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return ans;
    }
    private int helper(int[] weights , int chapacity) {
        int days = 1;
        int currSum = 0;
        for(int weight : weights) {
            if(currSum + weight > chapacity) {
                days++;
                currSum = weight;
            } else {
                currSum += weight;
            }
        }
        return days;
    }
}