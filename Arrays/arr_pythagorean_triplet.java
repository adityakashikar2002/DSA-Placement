// Pythagorean Triplet in Java
 
// A Pythagorean triple consists of three positive integers a, b, and c, such that a² + b² = c².
// Such a triple is commonly written, and a well-known example is. If is a Pythagorean triple, then so is for any positive integer k.
// A primitive Pythagorean triple is one in which a, b and c are co-prime.

// Pythagorean Triplet in an Array in Java
// We have to find the set of Pythagorean triples from the given array that satisfies pythagorean triplet condition.
// Using Sorting (Time complexity: O(n^2) )
// Note: Pythagorean triplets condition: a^2 + b^2 = c^2
	
import java.util.Arrays;

class arr_pythagorean_triplet {

	public static void main(String[] args) 
    { 
        int arr[]={3,4,5,6,7,8};
        int n = arr.length;
        
        isTriplet(arr,n);
    } 
	
	public static void isTriplet(int arr[], int n)
	{
		int i,a,b,c;
		boolean flag = false; 
		//1) Find Squares
		for(i=0;i<n;i++)
			arr[i]=arr[i]*arr[i];
		
		//2) Sort
		Arrays.sort(arr);
		
		//3) left and right pointers
		
		for(a=n-1;a>=2;a--) // a
		{
			b=0;            // b
			c=i-1;          // c
			
			while(b<c)
			{
				if(arr[b]+arr[c]==arr[a])
				{
					int x = (int )Math.sqrt(arr[b]);
					int y = (int )Math.sqrt(arr[c]);
					int z = (int )Math.sqrt(arr[a]);
					
					System.out.println("Triplet is: "+x+", "+y+", "+z);
					flag=true;
					b++;
					c--;
				}
				else if(arr[b]+arr[c]<arr[a])
					b++;
				else
					c--;
			}
		}
		if(flag!=true)
		{
			System.out.println("No Triplets Found !!");
		}
		
	}

}
