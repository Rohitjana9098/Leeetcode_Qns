import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        generateSubsets(nums, 0, curr, result);

        return result;
    }

    private void generateSubsets(int[] nums, int idx,List<Integer> curr,List<List<Integer>> result) {

        // Base case
        if (idx == nums.length) {
            result.add(new ArrayList<>(curr));
            return;
        }

        generateSubsets(nums, idx + 1, curr, result);

        curr.add(nums[idx]);

        generateSubsets(nums, idx + 1, curr, result);

        // Backtrack
        curr.remove(curr.size() - 1);
    }
}