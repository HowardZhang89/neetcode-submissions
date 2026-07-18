class Solution {
    public void reverseString(char[] s) {
        int headPtr = 0;
        int tailPtr = s.length - 1;

        while(headPtr < tailPtr){
            char tmp = s[headPtr];
            s[headPtr++] = s[tailPtr];
            s[tailPtr--] = tmp;
        }
        return;
    }
}