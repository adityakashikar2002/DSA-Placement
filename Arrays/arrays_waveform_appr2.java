//Method 2 : Incrementing the loop by 2
//The above method using sorting has a time complexity of O(n log n), which may not be the most optimal solution for this problem. The Incrementing the loop by 2 method can indeed solve the problem in O(n) time complexity by making use of a single traversal of the array. Here are the steps for solving the problem in O(n) complexity:
//
//Step 1: Traverse all even position elements of the array (i.e. elements at index 0, 2, 4, 6, etc.).
//
//Step 2: For each even position element, check the following two conditions:
//
//Condition 1: If the current element is smaller than the previous odd element (i.e. element at index (i-1)), swap the previous and current element.
//
//Condition 2: If the current element is smaller than the next odd element (i.e. element at index (i+1)), swap the next and current element.
//
//By following these steps, you can rearrange the array in O(n) time complexity, as you are traversing the array once and performing constant time swaps. This method is more efficient compared to the sorting method in terms of time complexity for this specific problem.
import java.util.Arrays;
import java.util.Scanner;

class arrays_waveform_appr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 8, 1, 4, 6, 3, 2, 7 };
		int length = arr.length;
		
		waveform(arr,length);

	}
	
	public static void waveform(int[] arr, int l)
	{

		int i;
		for(i=0;i<l;i+=2)
		{
			if(i>0 && arr[i-1] > arr[i])
			{
				int temp=arr[i];
				arr[i]=arr[i-1];
				arr[i-1]=temp;
			}
			else if(i<l-1&& arr[i]<arr[i+1])
			{
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		
		System.out.println("\nWaveform Array is: ");
		for(i=0;i<l;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
