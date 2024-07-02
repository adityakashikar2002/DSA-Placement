import java.util.*;
class array_reverse {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,7};
		System.out.println("Original Array is: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		reverse(arr);
	}
	
	static void reverse(int[] arr)
	{
		int left=0;
		int right=arr.length-1;
		int temp;
		while(left<right)
		{
			temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			
			left++;
			right--;
		}
		
		System.out.println("Reversed Array is: ");
		for(int data: arr)
			System.out.print(data+" ");
	}
}
