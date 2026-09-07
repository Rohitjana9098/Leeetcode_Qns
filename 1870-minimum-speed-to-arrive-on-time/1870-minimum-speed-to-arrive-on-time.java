class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int n = dist.length;
        if(hour <= n - 1) {
           return -1;
        }
        int low = 1;
        int high = 10000000;
        int ans = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(helper(dist,hour,mid)) {
                ans = mid;
                high = mid -1;
            } else {
            low = mid + 1;
            }
        }
        return ans;
    }
    private boolean helper(int[] dist, double hour,int speed) {
      double total_hour = 0;
      int n = dist.length;

      for(int i = 0; i < n - 1; i++) {
        total_hour += (dist[i] + speed - 1)/ speed;

      }
      total_hour += (double) dist[n-1] / speed;
      return total_hour <= hour;
     }
}