class Solution {
    public boolean isPalindrome(String s) {
        // two pointer solution
        // head pointer and tail pointer
        
        int headPtr = 0;
        int tailPtr = s.length() - 1;

        while(headPtr < tailPtr){
            while(headPtr < tailPtr && !isAlphaNumeric(s.charAt(headPtr))){
                headPtr++;
            }
            while(headPtr < tailPtr && !isAlphaNumeric(s.charAt(tailPtr))){
                tailPtr--;
            }
            if(Character.toLowerCase(s.charAt(headPtr)) != 
            Character.toLowerCase(s.charAt(tailPtr))){
                return false;
            }
            headPtr++;
            tailPtr--;
        }
        return true;
    }

    private boolean isAlphaNumeric(char c){
        return (c >= 'a' && c <= 'z') || 
        (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }
}
