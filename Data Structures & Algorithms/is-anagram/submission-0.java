class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {return false;}

        // Use 26 char array for lower case letters as faster HashMap
        int[] map1 = new int[26];
        int[] map2 = new int[26];
        int ascii_a = 97;

        for(int i = 0; i < s.length(); i++){
            int ascii = s.charAt(i) - ascii_a;
            map1[ascii] += 1;
        }

        for(int i = 0; i < t.length(); i++){
            int ascii = t.charAt(i) - ascii_a;
            map2[ascii] += 1;
        }

        for(int i = 0; i < map1.length; i++){
            if(map1[i] != map2[i]){
                return false;
            }
        }

        return true;
    }
}
