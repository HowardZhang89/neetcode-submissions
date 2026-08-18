class Solution {
    public int rob(int[] nums) {
        // two choices at each house: rob or don't rob
        // brute force: recursively find all possible combinations O(2^N)
        // dynamic programming solution: record maximum at each step so far, we choose to rob or not depending on if N-1 or N-2 is greater

        int[] dp = new int[nums.length];
        if(nums.length == 1){return nums[0];}
        if(nums.length == 2){return Math.max(nums[0], nums[1]);}

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < nums.length; i++){
            dp[i] = Math.max(nums[i]+dp[i-2], dp[i-1]);
        }
        return dp[nums.length-1];
        
    }
}
