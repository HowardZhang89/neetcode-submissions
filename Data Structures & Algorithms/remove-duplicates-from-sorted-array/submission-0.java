class Solution {
    public int removeDuplicates(int[] nums) {
        // two pointer solution
        // already sorted, impossible for additional duplicates 
        // once we reach next number
        int l = 1;
        for(int r = 1; r < nums.length; r++){
            if(nums[r] != nums[r-1]){
                nums[l] = nums[r];
                l++;
            }
        }
        return l;
    }
}