class Solution {
    public void sortColors(int[] nums) {
       int bucket[] = new int[3];
        for(int num : nums){
            bucket[num]++;
        }
        int i = 0;
        for(int j = 0; j < 3; j++){
            for(int k = 0; k < bucket[j]; k++){
                nums[i++] = j;
            }
        }
    }
}