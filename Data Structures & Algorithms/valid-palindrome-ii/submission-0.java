class Solution {
    public boolean validPalindrome(String s) {
        // two pointer solution
        // how do we know to delete left or right pointer?
        // try both using recursion, use OR conditional
        
        int l = 0;
        int r = s.length() - 1;

        while (l < r){
            if( s.charAt(l) != s.charAt(r)){
               return validPalindromeHelper(s, l+1, r) || validPalindromeHelper(s,l,r-1);
            }else{
                l++; r--;
            }
        }
        return true;
    }
    private boolean validPalindromeHelper(String s, int l, int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }else{
                l++; r--;
            }
        }
        return true;
    }
}