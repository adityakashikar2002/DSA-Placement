// Max Consecutive Ones by Flipping at most (K) zeroes
//Given a binary array nums and an integer k,
//return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

class arr_consectives_ones_by_flipping_K_zeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,1,0,0,0,1,1,1,1,0};
		int k = 2;
		int n = arr.length;
		
		consecutiveOnesFlip_zeros(arr,n,k);
	}
	
	public static void consecutiveOnesFlip_zeros(int[] arr, int n, int k)
	{
		int left=0,right = 0;
		int len=0,maxLength=0;
		int zeroes = 0;
		
		while(right<n)
		{
			if(arr[right]==0)
			{
				zeroes++;
			}
			
			if(zeroes>k)
			{
				if(arr[left]==0)
				{
					zeroes--;
				}
				left++;
			}
			
			if(zeroes<=k)
			{
				len = right-left+1;
				maxLength=Math.max(maxLength, len);
			}
			
			right++;
				
		}
		
		System.out.println("the maximum number of consecutive 1's in the array if you can flip at most ("+k+") 0's is: \n"+maxLength);
	}
}
