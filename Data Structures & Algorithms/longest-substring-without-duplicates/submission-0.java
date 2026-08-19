class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int max = 0;
        // use set to represent sliding window
        Set<Character> set = new HashSet<>();

        // left and right pointers
        int l = 0;
        int r = 0;

        while(r < len){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            max = Math.max(max, r - l + 1);
            r++;
        }

        return max;





    

    }
}
