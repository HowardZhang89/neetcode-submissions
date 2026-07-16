class Solution {
    public String longestCommonPrefix(String[] strs) {

        // strs = ["bat","bag","bank","band"]
        // edge cases: [], [""],["bat",""]

        // set prefix to first string
        // for each subsequent string, if it doesn't include prefix, shorten prefix until it does
        // return what left of prefix after 

        String prefix = strs[0];
        for(int i = 0; i < strs.length; i++){
            int j = 0;
            while(j < Math.min(prefix.length(), strs[i].length())){
                if(strs[i].charAt(j) != prefix.charAt(j)){
                    break;
                }
                j++;
            }
            prefix = prefix.substring(0,j);
        }
        return prefix;

    }
}