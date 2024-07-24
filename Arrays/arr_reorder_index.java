//Reorder Array Using Given Indexes 
//On this page we will discuss about reorder array using given indexes .
//Given two input arrays of same size, second array is index array, we need to reorder array using given indexes array.
class arr_reorder_index {
	public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] index = {3, 1, 4, 0, 2};
        int i;
        int n=arr.length;
        
        int temp[] = new int[n];
        
        for(i=0;i<n;i++)
        {
        	temp[i] = arr[index[i]];
        }
        
        for(i=0;i<n;i++)
        {
        	arr[i] = temp[i];
        }
        
        System.out.println("Reordered array:");
        for(i=0;i<n;i++)
        	System.out.print(arr[i]+" ");
	}
	
}
