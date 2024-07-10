
class arr_segregte_0_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 0, 1, 2, 0, 1, 0, 2, 1};
        int n = arr.length;

        System.out.print("Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        dutchNationalFlag(arr, n);

        
	}
	
	public static void swap_elements_at(int[] arr, int mid, int lh )
	{
		int temp=arr[lh];
		arr[lh]=arr[mid];
		arr[mid]=temp;
	}
	
	public static void dutchNationalFlag(int arr[], int n)
	{
		int low=0;
		int high=n-1;
		int mid=0;
		
		while(mid<=high)
		{
			if(arr[mid]==0)
			{
				swap_elements_at(arr,mid,low);
				mid++;
				low++;
			}
			else if(arr[mid]==1)
				mid++;
			else if(arr[mid]==2)
			{
				swap_elements_at(arr,mid,high);
				high--;
			}
		}
		
		System.out.print("Segregated array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
	}
}
