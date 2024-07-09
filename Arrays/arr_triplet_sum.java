//To solve the problem of finding triplets in an array that sum to a given value in the most optimized way, you can use a combination of sorting and the two-pointer technique. This approach has a time complexity of 
//O(n^2), which is the most efficient known solution for this problem. Here's how you can do it:
//
//Sort the array: Sorting helps in using the two-pointer technique efficiently.
//Use two pointers: For each element in the array, use two pointers to find the other two elements that sum up to the target value.
import java.util.Arrays;

class arr_triplet_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int sum = 9;
        
        System.out.print("Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println("\nSum: " + sum);
        System.out.println("Triplets:");
        findTriplets(arr, n, sum);
	}
	
	static void findTriplets(int[] arr, int n, int sum)
	{
		Arrays.sort(arr);
		int i,j,k;
		
		for(i=0;i<=n-3;i++)
		{
			j=i+1;
			k=n-1;
			
			while(j<k)
			{
				if(arr[i]+arr[j]+arr[k]==sum)
				{
					System.out.println(arr[i]+","+arr[j]+","+arr[k]);
					j++;
					k--;
				}
				else if(arr[i]+arr[j]+arr[k]<sum)
					j++;
				else
					k--;
			}
		}
	}
}
