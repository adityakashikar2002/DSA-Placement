import java.util.* ;
import java.io.*; 

public class Bubble_Sort {
    
    public static void bubbleSort(int[] arr, int n) {   
        // Write your code here.
        int i,j;
        boolean sorted=true;
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    sorted=false;
                }

            }
            if(sorted)
                break;
        }

    }

}
