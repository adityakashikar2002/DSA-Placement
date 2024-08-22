import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Longest_Subarray_Zero_Sum {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
		int n = arr.size();
		int i;
		int csum=0,maxLen=0;

		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(0, -1);

		for(i=0;i<n;i++)
		{
			csum+=arr.get(i);

			if(map.containsKey(csum))
			{
				maxLen=Math.max(maxLen, i-map.get(csum));
			}
			else
			{
				map.put(csum, i);
			}
		}

		return maxLen;
	}
} 
