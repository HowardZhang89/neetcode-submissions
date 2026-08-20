class Solution {
    public int trap(int[] height) {
        // min(height[l], height[r]) - height[i]
        int len = height.length;
        int[] prefix = new int[len];
        int[] suffix = new int[len];

        // populate prefix array
        prefix[0] = height[0];
        suffix[len-1] = height[len-1];
        for(int i = 1; i < len; i++){
            prefix[i] = Math.max(prefix[i-1], height[i]);
        }
        // populate suffix Array 
        for(int i = len-2; i >= 0; i--){
            suffix[i] = Math.max(suffix[i+1], height[i]);
        }

        int water = 0;
        for(int i = 0; i < len; i++){
            water += (Math.min(prefix[i], suffix[i]) - height[i]);
        }

        return water;


    }
}
