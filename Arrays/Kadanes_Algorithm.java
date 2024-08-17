import java.util.* ;
import java.io.*; 

public class Kadanes_Algorithm {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long maxSum=Long.MIN_VALUE;
		long sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];	
			if(sum>maxSum)
				maxSum=sum;
			
			if(sum<0)
				sum=0;
			
		}
		maxSum = Math.max(maxSum, 0);

		return maxSum;
	}

}
