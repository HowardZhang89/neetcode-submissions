class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //bucket sort 
        // first pass: get counts of each value 
        // second pass: find the top
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            int count = map.getOrDefault(num, 0);
            map.put(num, ++count);
        }
        // find top k highest values
        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            arr.add(new int[]{entry.getValue(), entry.getKey()});
        }
        arr.sort((a,b) -> b[0] - a[0]);

        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = arr.get(i)[1];
        }
        return result;
        

    }
}
