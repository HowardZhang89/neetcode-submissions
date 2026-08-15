class Solution {
    List<List<Integer>> res = new ArrayList();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> current = new ArrayList();
        backtrack(nums,current, 0);
        return res;
    }

    private void backtrack(int[] nums, List<Integer> current, int idx){
        // base case
            res.add(new ArrayList(current));

        for(int i = idx; i < nums.length; i++){
            if(i > idx && nums[i] == nums[i-1]){
                continue;
            }
            current.add(nums[i]);
            backtrack(nums, current, i+1);
            current.remove(current.size()-1);
        }
    }
}
