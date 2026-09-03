class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
         int high = 0;
         for(int pile : piles) {
            high = Math.max(high,pile);
         }
         int result = high;
         while(low <= high) {
            int mid = low + (high - low) / 2;
            long hours_need = helper(piles,mid);
            if(hours_need <= h) {
                result = mid;
                high = mid -1;
            } else {
                low = mid + 1;
            }
         }
         return result;
    }
    private long helper(int[] piles , int k) {
        long total_hours = 0;
        for(int pile : piles ) {
            total_hours += (pile + k - 1) / k;
        }
        return total_hours;
    }
}