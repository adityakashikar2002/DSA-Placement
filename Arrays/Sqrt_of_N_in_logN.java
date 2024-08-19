import java.util.*;

public class Sqrt_of_N_in_logN {

    public static int sqrtN(long N) {
        /*
         * Write your code here
         */
        long low = 0;
        long high = N;
        while (low <= high) {
            long mid = low + (high - low) / 2; // Avoid potential overflow
            long midSquare = mid * mid;

            if (midSquare == N) {
                return (int) mid;
            } else if (midSquare < N) {
                low = mid + 1;
            } else {
                high = mid-1;
            }
        }

        // Return high as the closest integer less than or equal to the square root
        return (int) high;
    }
}
//--------------------------------------------------------------------------------------------------------
class Solution {
    public int mySqrt(int N) {
        int low = 0;
        int high = N;
        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoid potential overflow
            

            if ((long) mid*mid == (long) N) {
                return (int) mid;
            } else if ((long) mid*mid < (long) N) {
                low = mid + 1;
            } else {
                high = mid-1;
            }
        }

        // Return high as the closest integer less than or equal to the square root
        return high;
    }
}
