import java.util.* ;
import java.io.*; 
public class firstmissingpositive {
	public static int firstMissing(int[] arr, int n) {
		// Write your code here.	
		int i;
		boolean flag = false;
		for(i=0;i<n;i++)
		{
			if(arr[i]==1)
			{
				flag = true;
			}
			if(arr[i]<=0||arr[i]>n)
			{
				arr[i]=1;
			}
		}

		if(!flag)
		{
			return 1;
		}
		
		if(flag==true)
		{
			
			for(i=0;i<n;i++)
			{
				int idx=Math.abs(arr[i])-1;
				if(arr[idx]>0)
				{
					arr[idx]=-arr[idx];
				}
			}

			for(i=0;i<n;i++)
			{
				if(arr[i]>0)
				{
					return i+1;
					
				}
			}
			
		}
		return n+1;

	}
}
