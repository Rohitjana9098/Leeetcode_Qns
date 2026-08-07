
public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        // Sorting enables early pruning when candidate > remaining target
        Arrays.sort(candidates);
        
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int targetRemaining, int start, 
                           List<Integer> path, List<List<Integer>> result) {
        // Base case: combination found
        if (targetRemaining == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Early pruning: stop exploring if the number exceeds the remaining target
            if (candidates[i] > targetRemaining) {
                break;
            }

            // Choose
            path.add(candidates[i]);
            // Explore: pass 'i' (not 'i + 1') to allow reusing the same element
            backtrack(candidates, targetRemaining - candidates[i], i, path, result);
            // Backtrack (un-choose)
            path.remove(path.size() - 1);
        }
    }
}