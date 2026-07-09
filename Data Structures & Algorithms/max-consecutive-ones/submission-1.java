class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;
        // iterate through array tracking number of consecutive 1s
        for(int num : nums){
            if(num == 0){
                max = Math.max(max, current);
                current = 0;
            }
            else{
                current++;
            }
        }
        return Math.max(max, current);
    }
}