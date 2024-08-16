import java.util.* ;
import java.io.*; 
public class Selection_Sort {
	public static void selectionSort(int arr[], int n) {
		for (int i = 0; i < n - 1; i++) 
		{
        	int minIndex = i;
        	for (int j = i + 1; j < n; j++) 
			{
            	if (arr[j] < arr[minIndex]) 
				{
                	minIndex = j;
            	}
        	}
        	if (minIndex != i) 
			{
            	int temp = arr[minIndex];
            	arr[minIndex] = arr[i];
            	arr[i] = temp;
        	}
    	}
		
	}
}