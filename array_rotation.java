import java.util.*;
class array_rotation
{

    static void LeftRotate(int[] arr, int r)
    {
    	for(int j=1;j<=r;j++)
    	{
    		 int temp = arr[0];
    	        for(int i=0;i<arr.length;i++)
    	        {	if(i+1==arr.length)
    	        		arr[arr.length-1]=temp;
    	        	else
    	        		arr[i]=arr[i+1];
    	        }
    	        System.out.println("\nNew ARRAY after "+j+" Left rotation is: ");
    	        for(int data: arr)
    	            System.out.print(data+ " ");
    	}
    }

    static void RightRotate(int[] arr, int r)
    {
    	for(int j=1;j<=r;j++)
    	{
    		 int temp = arr[arr.length-1];
    	        for(int i=arr.length-1;i>=0;i--)
    	        {	
    	        	if(i-1<0)
    	        		arr[0]=temp;
    	        	else
    	        		arr[i]=arr[i-1];
    	        }
    	        System.out.println("\nNew ARRAY after "+j+" Right rotation is: ");
    	        for(int data: arr)
    	            System.out.print(data+ " ");
    	}
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello");
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("Enter (L) for Left Rotation & (R) for Right Rotation and also rotation index.");
        String r_style = sc.next();
        int r = sc.nextInt();
        if(r_style.equals("L"))
            LeftRotate(arr,r);
        else
            RightRotate(arr,r);
    }
}