//Sorting of elements by frequency in Java
//Here, we will discuss the program for sorting of elements by frequency frequency in Java programming language. We are given with an integer array and need to sort the array on the basis of there occurence.
// 1) Calculate count of each ele
// 2) Use Hashmap 
// 3) Collections for sort and a comparator for same frequency ele sort by occurring first  
import java.util.*;

class arr_frequency_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 10, 10, 20, 30, 30, 30, 30, 0};
        int n = arr.length;
        int[] result=new int[n];
        result=sortByFrequency(arr, n);
        
        System.out.println("Result: ");
        
        for(int ele: result)
        	System.out.print(ele+" ");
	}
	
	public static int[] sortByFrequency(int arr[], int n)
	{
		Map<Integer,Integer> map = new HashMap<>();
		
		List<Integer> ans = new ArrayList<>(); 
		
		for(int x: arr)
		{
			ans.add(x);
			
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		
		Collections.sort(ans, (a,b) -> (map.get(a)==map.get(b))? a - b: map.get(b)-map.get(a));
		
		return ans.stream().mapToInt(i -> i).toArray(); 
	}

}
