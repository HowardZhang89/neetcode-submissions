class Solution {
    public int majorityElement(int[] nums) {
        // constaints: nums >= 1, majority always exists
        int max = (nums.length / 2) + 1;

        // hashset 0(N) time, O(N) sPredicate
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int num : nums){
            int count = hashMap.getOrDefault(num, 0) + 1;
            if(count >= max){
                return num;
            };
            hashMap.put(num, count);
        }
        return nums[0];
    }
}