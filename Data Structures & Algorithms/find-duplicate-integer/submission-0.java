class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hashset = new HashSet<>();
        for(int num : nums){
            if(hashset.contains(num)){
                return num;
            }
            hashset.add(num);
        }
        return -1;
    }
}
