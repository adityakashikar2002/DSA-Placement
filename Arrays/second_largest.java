import java.util.* ;
import java.io.*; 
public class second_largest {
	public static int findSecondLargest(int n, int[] arr) {
		// Write your code here.
		int i;

		int fl,sl;
		fl=sl=Integer.MIN_VALUE;		

		for(i=0;i<n;i++)
		{
			if(arr[i]>fl)
			{
				sl=fl;
				fl=arr[i];
			}
			else if(arr[i]>sl&&arr[i]<fl)
			{
				sl=arr[i];
			}
		}

		return sl == Integer.MIN_VALUE ? -1 : sl;
	}

	
}
