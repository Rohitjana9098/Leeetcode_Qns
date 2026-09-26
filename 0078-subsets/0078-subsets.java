import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        generateSubsets(nums, 0, temp, result);

        return result;
    }

    private void generateSubsets(int[] nums, int idx,List<Integer> temp,List<List<Integer>> result) {

        // Base case
        if (idx == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        // Choice 1: Exclude the current element
        generateSubsets(nums, idx + 1, temp, result);

        // Choice 2: Include the current element
        temp.add(nums[idx]);

        generateSubsets(nums, idx + 1, temp, result);

        // Backtrack
        temp.remove(temp.size() - 1);
    }
}