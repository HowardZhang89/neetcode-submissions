class Solution {
    
    List<List<Integer>> result = new ArrayList();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> current = new ArrayList();   
        dfs(candidates, target, current, 0);
        return result;
    }

    private void dfs(int[] candidates, int target, List<Integer> current, int idx){
        // base case
        if(target == 0){result.add(new ArrayList(current));}
        
        // backtracking
        for(int j = idx; j < candidates.length; j++){
            if(j > idx && candidates[j] == candidates[j-1]){
                continue;
            }
            if(target < 0 ){break;} // no need to keep going
            
            // include it 
            current.add(candidates[j]);
            dfs(candidates, target - candidates[j], current, j+1);
            // backtrack
            current.remove(current.size() - 1);
        }
    }
}
