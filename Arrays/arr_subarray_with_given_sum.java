//Sub-Array With Given Sum in Java
//A Sub-array with given sum code in Java is a program that  to a contiguous subsequence of elements within an array that has a sum equal to a specific target value. In other words, it is a consecutive sequence of elements in an array whose sum is equal to a given sum value. The goal is to find such a sub-array within the given array.
//
//Example : arr[ ] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
//Output : Sum found between indexes 1 and 4 Sum of elements between indices 1 and 4 is (4 + 0 + 0 + 3) = 7
//
//On this page we will discuss two different methods for this-
//
//
//Sliding Window Approach
class arr_subarray_with_given_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {15, 2, 4, 8, 9, 5, 10, 23};
		int sum=23;
		subarray_with_given_sum(arr,sum);
	}
	static void subarray_with_given_sum(int arr[], int sum)
	{
		int curr_sum=0,n=arr.length;
		int start=0,end=0,i;
		boolean flag = false;
		
		for(i=0;i<n;i++)
		{
			curr_sum+=arr[i];
			
			while(curr_sum>sum)
			{
				curr_sum=curr_sum - arr[start];
				start++;
			}
			
			if(curr_sum==sum)
			{
				end=i;
				flag=true;
				break;
			}

		}
		if(flag==true)
			System.out.println(start+" "+end);
		else
			System.out.println("Subarray Not Found!!");
	}	

}
