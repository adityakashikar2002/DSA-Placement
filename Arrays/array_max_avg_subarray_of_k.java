//Maximum Average Sub-array of K length
//In Java, maximum average sub-array of k length pertains to a contiguous sub-array of length k in a given array of numbers, where the average (mean) of the k elements is the highest among all possible sub-arrays of length k in that array. In simpler words, it refers to the sub-array of k consecutive elements whose sum is the largest possible among all sub-arrays of k consecutive elements in the array, resulting in the highest average value.
//
//For example,consider the array
//
//[1, 12, -5, -6, 50, 3] and k=4.
//The subarrays of length 4 are [1, 12, -5, -6], [12, -5, -6, 50], [-5, -6, 50, 3], and their averages are 0.5, 12.75, and 10.5 respectively. The maximum average subarray of length 4 in this case is [12, -5, -6, 50], whose average is 12.75.
//The idea is to calculate the sum of the first k elements, then slide the window by one element at a time, updating the sum by subtracting the element that is left behind and adding the new element that comes into the window. This way, we can find the maximum average in linear time.
//
//Here’s the algorithm:
//
//1) Initialize max_sum to be the sum of the first k elements of the array.
//2) Set current_sum to max_sum.
//3)Initialize max_index to 0.
//4) Iterate from i = 1 to l - k:
//5) Update current_sum by subtracting the element that is left behind(i-1) and adding the new element(i+k-1).
//6) If current_sum is greater than max_sum, update max_sum and set max_index to i.
//7) Return max_index.
//---------------------------------------------------------------------------------------------------------------
class array_max_avg_subarray_of_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {-1, 10, -15, -6, 50, 3};
		int[] arr = {1, 1, -5, -6, 50, 3};
        int k = 4;
        int n = arr.length;
        System.out.println("The maximum average subarray of length " + k + " begins at index " + findMaxAverage(arr, n, k));
	}
	
	
	public static int findMaxAverage(int arr[], int l, int k)
	{
		if(k>l)
			return -1;
		
		double max_avg=0,avg=0,sum=0;
		int i,max_index=0, curr_index; // curr_index is starting index of sub-array
		
		for(i=0;i<k;i++)
		{
			sum+=arr[i];
		}
		max_avg=sum/k;
		
		for(curr_index=1;curr_index<=l-k;curr_index++)
		{
			avg=0;
			sum=sum - arr[curr_index-1] + arr[curr_index+k-1]; // add next and delete prev ele (sliding window approach)
			avg=sum/k;
			if(max_avg<avg)
			{
				max_avg=avg;
				max_index=curr_index;
			}
		}
		return max_index;
		
	}
	
}
