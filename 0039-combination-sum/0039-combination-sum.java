class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        int index = 0;
        int sum = 0;
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        fun(candidates,n,index,temp,sum,result,target);     
        return result;   
        }
    private static void fun(int[] a, int n,int index,List<Integer> temp , int sum,
    List<List<Integer>> res,int target) {
        if(index == n){
            if(sum == target) {
                res.add(new ArrayList<>(temp));
            }
        return;
        }
        //choice 1
        fun(a,n,index+1,temp,sum,res,target);
        //choice 2
        if(sum + a[index] <= target) {
            temp.add(a[index]);
            sum+=a[index];
            fun(a,n,index,temp,sum,res,target);
            temp.remove(temp.size() - 1);
            sum -= a[index];
        }

    }

}