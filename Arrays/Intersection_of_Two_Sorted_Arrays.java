import java.util.* ;
import java.io.*; 
public class Intersection_of_Two_Sorted_Arrays
{
	public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		// Write Your Code Here.
		int i=0,j=0;
		ArrayList<Integer> list = new ArrayList<>();

		while(i<n&&j<m)
		{
			if(arr1.get(i)<arr2.get(j))
				i++;
			else if(arr1.get(i)>arr2.get(j))
				j++;
			else if(arr1.get(i).equals(arr2.get(j)))
			{
				list.add(arr1.get(i));
				i++;
				j++;
			}
		}
		return list;
	}
}
//---------------------------------------------------------------------------------------------------------------------------------------------
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for(int i:nums1)
        {
            s1.add(i);
        }

        for(int i:nums2)
        {
            if(s1.contains(i))
                s2.add(i);
        }

        int[] res = new int[s2.size()];
        int k=0;
        for(int i:s2)
            res[k++]=i;

        return res;    
    }
}
