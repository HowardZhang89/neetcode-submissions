class Solution {
    public int removeElement(int[] nums, int val) {
        // naive solution: bubblesort any values == val to the end 
        // better: two pointer solution
        // left pointer moves right, every time it encounters val, swap it with right pointer and r--
        
        int l =0;
        int r = nums.length;

        while(l < r){
            if(nums[l] == val){
                nums[l] = nums[--r];
            }else{
                l++;
            }
        }

        return l;
    }
}