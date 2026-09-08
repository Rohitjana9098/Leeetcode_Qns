class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int low = 1;
        int high = 0;
        for(int quantitie:quantities) {
            high = Math.max(high,quantitie);
        }
        int ans = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(helper(n,quantities,mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return ans;
        
    }
    private boolean helper(int n, int[] quantities,int mid) {
      int total_sum = 0;
      for(int i = 0; i < quantities.length ; i++) {
        total_sum += (quantities[i] + mid -1) / mid;
      }
      return total_sum <= n;
    }
}