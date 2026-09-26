import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        backtrack(0, nums, curr, ans);

        return ans;
    }

    public void backtrack(int index, int[] nums,List<Integer> curr,List<List<Integer>> ans) {

        // Store the current subset
        ans.add(new ArrayList<>(curr));

        for (int i = index; i < nums.length; i++) {
            // Choose
            curr.add(nums[i]);

            // Explore
            backtrack(i + 1, nums, curr, ans);

            // Undo the choice
            curr.remove(curr.size() - 1);
        }
    }
}