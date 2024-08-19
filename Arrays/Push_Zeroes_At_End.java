import java.util.ArrayList; 
public class PushZeroesAtEnd 
{
	public static void pushZerosAtEnd(ArrayList<Integer> arr)
	{
		// Write your code here.
		int n = arr.size();
		int nonZeroIndex=0;

		for(int i=0;i<n;i++)
		{
			if(arr.get(i)!=0)
			{
				arr.set(nonZeroIndex,arr.get(i));
				nonZeroIndex++;
			}
		}

		for(int i=nonZeroIndex;i<n;i++)
			arr.set(i, 0);

        
	}
}
//-----------------------------------------------------------------------------------
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
		int nonZeroIndex=0;

		for(int i=0;i<n;i++)
		{
			if(nums[i]!=0)
			{
				nums[nonZeroIndex]=nums[i];
				nonZeroIndex++;
			}
		}

		for(int i=nonZeroIndex;i<n;i++)
			nums[i]=0;
    }
}
