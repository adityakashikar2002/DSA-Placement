
class array_largest_sum_subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int l = arr.length;
        int max_sum,cur_sum;
        
        max_sum=Integer.MIN_VALUE;
        cur_sum=0;
        for(int i=0;i<l;i++)
        {
        	cur_sum+=arr[i];
        	if(cur_sum > max_sum)
        		max_sum=cur_sum;
        	
        	if(cur_sum<0)   // checking if sum goes -ve the stop add and restart for longest sum
        		cur_sum=0;
        }
        
        System.out.println("Max Sum is: "+max_sum);
	}

}
