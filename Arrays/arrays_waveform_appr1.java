//Sort Array in Waveform in Java Language
//Sorting an array in waveform refers to the process of rearranging the elements of the array in a specific manner, such that the resulting array represents a waveform-like pattern. In waveform sorting, the elements of the array are arranged in a way that alternates between ascending and descending order, mimicking the shape of a waveform with peaks and troughs.
//
//For example, consider the following waveform sorted array:
//
//[10, 5, 6, 2, 20, 3, 48, 30]
//
//In this array, the first element 10 is the peak, the second element 5 is the valley, the third element 6 is the peak again, the fourth element 2 is the valley, the fifth element 20 is the peak and so on.

//Method 1 : Brute Force Solution (using sorting)
//The brute force solution using sorting involves the following steps:
//
//Step 1: Sort the array in ascending order. For example, if the input array is {20, 30, 5, 25, 10, 15}, after sorting, we get {5, 10, 15, 20, 25, 30}.
//
//Step 2: Swap all adjacent elements of the array. Using the sorted array from step 1, we swap adjacent elements to obtain the final result. For example, swapping adjacent elements in the sorted array {5, 10, 15, 20, 25, 30} would give us {10, 5, 20, 15, 30, 25}.
//
//This method is simple but may not be the most efficient solution for larger arrays, as sorting has a time complexity of O(n log n) and swapping adjacent elements has a time complexity of O(n), resulting in an overall time complexity of O(n log n) + O(n), which can be further optimized.
import java.util.*;

class arrays_waveform_appr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = { 5, 8, 1, 4, 6, 3, 2, 7 };
		int length = arr.length;
		
		waveform(arr,length);

	}
	
	public static void waveform(int[] arr, int l)
	{
		Arrays.sort(arr);
		int i,j;
		System.out.println("Sorted Array is: ");
		for(i=0;i<l;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		for(j=0;j<l;j+=2)
		{
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		}
		System.out.println("\nWaveform Array is: ");
		for(i=0;i<l;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
