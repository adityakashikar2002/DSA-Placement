import java.util.* ;
import java.io.*; 
public class make_arr_unique {

	public static int minElementsToRemove(ArrayList<Integer> arr) {

        int count=0,i;
        int n=arr.size();

        HashSet<Integer> set = new HashSet<>();

        for(i=0;i<n;i++)
        {
            if(set.contains(arr.get(i)))
                count++;
            else
              set.add(arr.get(i));
        }

        return count;
	}
}
