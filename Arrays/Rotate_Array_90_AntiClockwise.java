import java.util.* ;
import java.io.*; 
public class Rotate90AntiClock {
	
	public static void inplaceRotate(int[][] arr, int n) {
		// Write your code here.
		int i,j;
		// Reverse row
		for(i=0;i<n;i++)
		{
			int start=0;
			int end=n-1;
			while(start<end)
			{
				int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
			}
		}

		//Transpose arr
		for(i=0;i<n;i++)
		{
			for(j=i;j<n;j++)
			{
				int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
			}
		}
	}

}
