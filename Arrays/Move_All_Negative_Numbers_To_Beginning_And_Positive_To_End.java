public class Move_All_Negative_Numbers_To_Beginning_And_Positive_To_End {
    public static int[] separateNegativeAndPositive(int a[]) {
        
        int left = 0;
        int right = a.length - 1;
        
        while (left <= right) 
        {
            // Move left pointer until we find a positive number
            while (left <= right && a[left] < 0) 
            {
                left++;
            }
            
            // Move right pointer until we find a negative number
            while (left <= right && a[right] >= 0) 
            {
                right--;
            }
            
            // If there are elements to swap, swap them
            if (left < right) 
            {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
            }
        }

        return a;
    }
}
