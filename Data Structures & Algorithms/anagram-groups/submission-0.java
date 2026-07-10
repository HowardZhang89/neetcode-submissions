class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String str : strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = String.valueOf(charArr);
            if(map.containsKey(sortedStr)){
                ArrayList<String> tmp = map.get(sortedStr);
                tmp.add(str);
            }else{
                ArrayList<String> tmp = new ArrayList<>();
                map.put(sortedStr, tmp);
                tmp.add(str);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for(String key : map.keySet()){
            ArrayList<String> tmp = map.get(key);
            result.add(tmp);
        }

        return result;

    }

}
