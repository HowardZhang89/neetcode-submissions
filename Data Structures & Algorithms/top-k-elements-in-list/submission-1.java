class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];
        // initialize each potential frequency with an empty arrayList
        for(int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        // get count of each value in nums and put into HashMap
        for(int n : nums){
            int c = count.getOrDefault(n, 0);
            count.put(n, c + 1);
        }
        // populate frequency lists (eg. if 2 and 3 both show up 8 times, freq[8] -> ArrayList {2, 3})
        for(Map.Entry<Integer, Integer> entry: count.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }
        int[] res = new int[k];
        int idx = 0;
        int i = freq.length -1;
        while(i > 0 && idx < k){
            for(int n : freq[i]){
                res[idx++] = n;
                if(idx == k){
                    return res;
                }
            }
            i--;
        }
        return res;
    }
}
