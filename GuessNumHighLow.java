/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return       -1 if num is higher than the picked number
 *                1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int first = 1;
        int last = n;

        while (first < last) {
            int middle = first + (last - first) /2;

            if (guess(middle) <= 0) {
                last = middle;
            }
            else {
                first = middle + 1;
            }
        }
        return first;
    }
}
