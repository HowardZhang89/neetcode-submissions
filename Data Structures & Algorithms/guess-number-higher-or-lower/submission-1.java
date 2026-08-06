/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 0; int r = n;
        int m = l + (r - l) / 2;
        int hint = guess(m);
        while(hint != 0){
            if(hint > 0){
                l = m + 1;
            }else{
                r = m - 1;
            }
            m = l + (r - l) / 2;
            hint = guess(m);
        }
        
        return m;
    }
}