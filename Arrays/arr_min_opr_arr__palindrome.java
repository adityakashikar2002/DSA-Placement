//Minimum number of merge operations
//We discuss code for finding Minimum number of merge operations to make array palindrome.
//We are given with an array of positive integers. If array is not a palindrome, make merge operations and prints the number of merge operations. In each merge operation it will merge two adjacent elements. Here, merging two elements means replacing them with their sum.
//
//A palindrome is a word, phrase, or sequence that reads the same backwards as forwards.
class arr_min_opr_arr__palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n = 4; 
		//int arr[] = {2, 4, 3, 2};
		int n = 11;
		int arr[] = {2,4,3,2,5,6,5,1,4,4,2};
		
		mergeArrPalin(arr,n);
	}
	
	public static void mergeArrPalin(int[] arr, int n)
	{
		int i = 0;
		int j = n-1;
		int ans=0;
		
		while(i<j)
		{
			if(arr[i]==arr[j])
			{
				i++;
				j--;
			}
			else if(arr[i]<arr[j])
			{
				arr[i+1]+=arr[i];
				i++;
				ans++;
			}
			else
			{
				arr[j-1]+=arr[j];
				j--;
				ans++;
			}
		}
		
		System.out.println("The Minimum no. of Merge-Operations needed to Make Array Palindrome were: "+ans);
	}
}
