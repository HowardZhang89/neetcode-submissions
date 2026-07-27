class Solution {
    public void sortColors(int[] nums) {
        // two pointer solution
        int l = 0;
        int r = nums.length - 1;
        int i = 0;
        // [2,0,2,1,1,0] --> [0,0,1,1,2,2]
        while(i <= r){
            if(nums[i]==0){
                swap(nums,l,i);
                l++;
            } else if(nums[i] == 2){
                swap(nums,i,r);
                r--;
                i--;
            }
            i++;
        }
        
    }

    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}