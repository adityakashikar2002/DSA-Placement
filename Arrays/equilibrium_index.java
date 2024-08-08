import java.util.* ;
import java.io.*; 
public class Equilibrium_Index {

	public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
		int i,n;
		int tsum=0;
		int lsum=0;

		n= arr.length;
		for(i=0;i<n;i++)
		{
			tsum+=arr[i];
		}

		for(i=0;i<n;i++)
		{

			if(tsum-lsum-arr[i]==lsum)
				return i;
				
			lsum+=arr[i];
			
		}
		return -1;
	}
}
