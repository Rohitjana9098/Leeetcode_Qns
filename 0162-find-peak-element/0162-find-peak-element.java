class Solution {
    public int findPeakElement(int[] arr) {
        
        int low = 0;
        int high = arr.length -1;
        int ans = 0;

        while(low < high) {
            int mid = low + (high - low) / 2;
           if(arr[mid] <= arr[mid+1]) {
                low = mid + 1;
                ans = low;
            } else {

                high = mid ;
            }
        }
        return ans;
    }
}