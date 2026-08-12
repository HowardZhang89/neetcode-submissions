class Solution {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> cur = new ArrayList();
        dfs(nums, target, cur, 0);
        return res;
    }

    private void dfs(int[] nums, int target, List<Integer> cur, int i){
    // base case(s)
        if(target == 0){
            res.add(new ArrayList(cur));
            return;
        }
    // if adding j is greater than target, break, no need to continue
        for(int j = i; j < nums.length; j++){
            if(target - nums[j] < 0){
                return;
            }
            cur.add(nums[j]);
            dfs(nums, target - nums[j], cur, j);
            cur.remove(cur.size()-1);
        }
    }
}
