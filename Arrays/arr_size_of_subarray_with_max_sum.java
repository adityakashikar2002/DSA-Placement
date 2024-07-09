//Size of sub-array with Max Sum in Java
//The “Size of Sub-array with Maximum Sum” problem is a common algorithmic problem that involves finding the length or size of a contiguous sub-array within an array of integers, such that the sum of the sub-array is maximum among all possible sub-arrays. In other words, we need to find the sub-array with the largest sum.
//
//Here’s an example to illustrate the problem:
//
//Given an array of integers: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
//
//The subarray with the maximum sum is [4,-1,2,1], and the sum of this sub-array is 6. Thus, the size of the subarray with the maximum sum is 4.
//
//The problem can be solved using efficient algorithms such as Kadane’s algorithm, which has a time complexity of O(N), where N is the size of the input array. Kadane’s algorithm iterates through the array in a single pass, keeping track of the maximum sum of sub-arrays ending at each position of the array, and updating it as necessary.
class arr_size_of_subarray_with_max_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int n = arr.length;
		
		size_of_subarray_with_max_sum(arr,n);
	}
	
	public static void size_of_subarray_with_max_sum(int[] arr,int n)
	{
		int i,sum=0,max_sum=Integer.MIN_VALUE;
		int start=0,end=0;
		
		for(i=0;i<n;i++)
		{
			if(sum+arr[i]>arr[i])
			{
				sum=sum+arr[i];
			}
			else
			{
				sum=arr[i];
				start=i;
			}
			
			if(sum>max_sum)
			{
				max_sum=sum;
				end=i;
							
			}

		}
		System.out.println("Length of subarray with Max_sum is: "+(end-start+1));
		
	}

}
