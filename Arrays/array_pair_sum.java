//Pairs in Array with Given Sum in Java

//The array is first sorted in ascending order in the sorting technique.
//Then, we employ two pointers, one of which points to the first element and the other to the last element.
//These two pointers values are added, and we then check to see if the result equals the specified sum.
//The left pointer is increased if the value is less than the total, and the right pointer is decreased if the value is higher.
//This method has a time complexity of O(n log n) due to the sorting algorithm used.

import java.util.Arrays;

class array_pair_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 8, 1, 4, 6, 3, 2, 7 };
        int n = arr.length;
        int targetSum = 10;
        Arrays.sort(arr);
        findPairs (arr, n, targetSum);
	}
	
	static void findPairs(int[] arr, int length, int sum)
	{
		int l=0;
		int r=length-1;
		System.out.print("Pairs are: ");
		while(l<r)
		{
			int total = arr[l]+arr[r];
			if(total == sum)
			{
				System.out.print("("+arr[l]+","+arr[r]+") ");
				l++;
				r--;
			}
			else if(total<sum)
				l++;
			else
				r--;
		}
		
	}

}
