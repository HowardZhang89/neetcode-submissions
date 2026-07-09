class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;
        // iterate through array tracking number of consecutive 1s
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                current++;
                if(current > max){
                    max = current;
                }
            }
            else{ // nums[i] == 0
                current = 0;
            }
        }
        return max;
    }
}