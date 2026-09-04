class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low = 1;
        int high = 0;
        for(int bloom : bloomDay) {
            high = Math.max(high,bloom);
        }
        int ans = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(helper(bloomDay,m,k,mid)) {
                ans = mid;
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return ans;

    }
    private boolean helper(int[] bloomDay, int m, int k , int days) {
        int count = 0; 
        int Bouquets = 0;
        for(int bloom : bloomDay) {
            if(bloom <= days) {
                count++;
            if(count == k) {
                Bouquets++;
                count = 0;
            }
        } else {
            count = 0;
        }
        }
        return Bouquets >= m;
    }
}