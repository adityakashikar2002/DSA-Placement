import java.util.* ;
import java.io.*; 
public class non_decreasing_arr {
	public static boolean isPossible(int[] arr, int n) 
    {
        int count = 0;
        int i;
       for (i = 1; i < n && count<=1; i++) {

            if (arr[i-1] > arr[i]) 
            {

                count++;

                if (i - 2 >= 0 && arr[i-2] > arr[i]) 
                {
                    arr[i] = arr[i-1]; // Modify arr[i] to arr[i-1]
                } 
                else
                {
                    arr[i-1] = arr[i]; // Modify arr[i-1] to arr[i]
                }

            }

        }
        return count<=1;
    }
}
