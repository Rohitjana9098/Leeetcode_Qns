class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer , Boolean > seen = new HashMap<>();

        for(int num : nums) {
            // Check if the current number is already in our map
            if(seen.containsKey(num)) {
                return true;
            }
            // if not in the map
            seen.put(num,true);
        }
        return false;
    }
}