//Merging Two Sorted Arrays In Java
//Merging two sorted arrays in Java involves combining two sorted arrays into one sorted array. This can be done efficiently by comparing the first element of each array and adding the smaller one to a new array. The process is repeated until all elements from both arrays are added to the new array. Here is an example:
//First Array = [12, 18, 40, 60]
//Second Array = [47, 56, 89, 90]
//
//Merged Array = [12, 18, 40, 47, 56, 60, 89, 90]
class arr_merge_sorted_arrays {
	public static void main(String[] args)
	{
		int n1 = 4;
		int arr1[] = {12, 18, 40, 60};
		int n2 = 4;
        int arr2[] = {47, 56, 89, 90};
		
		System.out.print("First Array : ");
        for (int i = 0; i < n1; i++)
            System.out.print(arr1[i] + " ");
		
		System.out.print("\nSecond Array : ");
        for (int i = 0; i < n2; i++)
            System.out.print(arr2[i] + " ");
		
        int arr3[] = new int[n1 + n2];
        
       merge(arr1, arr2, n1, n2, arr3);
		
	}
	
	public static void merge(int[] a, int[] b, int n1, int n2, int[] c)
	{
		int i=0,j=0,k=0;
		
		while(i<n1&&j<n2)
		{
			if(a[i]<b[j])
			{
				c[k++]=a[i];
				i++;	
			}
			else
			{
				c[k++]=b[j];
				j++;	
			}
			
		}
		
		if(i==n1&&j<n2)
		{
			while(j<n2)
				c[k++]=b[j++];
		}
		else if(j==n2&&i<n1)
		{
			while(i<n1)
				c[k++]=b[i++];
		}
		
		System.out.print("\nMerged Array is: ");
		for(int ele:c)
			System.out.print(ele+" ");
			
	}
}
