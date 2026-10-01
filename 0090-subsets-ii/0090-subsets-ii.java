class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        Helper(result,new ArrayList<>(),nums,0);
        return result;
    }
    private void Helper(List<List<Integer>> result,List<Integer> curr,int[] nums,int start) {
        result.add(new ArrayList<>(curr));

        for(int i = start ; i < nums.length;i++) {
            if(i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            curr.add(nums[i]);
            Helper(result,curr,nums,i+1);
            curr.remove(curr.size()-1);
        }

    }
}