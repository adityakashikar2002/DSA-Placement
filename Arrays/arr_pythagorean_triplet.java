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
