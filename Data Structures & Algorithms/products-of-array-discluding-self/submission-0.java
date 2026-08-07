class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        int[] prefix = new int[len];
        int[] postfix = new int[len];

        // populate prefix array 
        prefix[0] = 1;
        postfix[len-1] = 1;
        for(int i = 1; i < len; i++){
            prefix[i] = nums[i - 1] * prefix[i-1];
        }
        // populate postfix array 
        for(int i = len-2; i >= 0; i--){
            postfix[i] = nums[i+1] * postfix[i+1];
        }

        // calculate result array
        for(int i = 0; i < len; i++){
            result[i] = prefix[i] * postfix[i];
        }
        return result;
    }
}  
