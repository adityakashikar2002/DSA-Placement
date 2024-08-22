public class  Container_With_Most_Water {

	public static int maxArea(int[] height) {
	    // Write your code here.
		int left=0;
		int right=height.length-1;
		int maxWater=0;
		int currWater;

		while(left<right)
		{
			currWater=Math.min(height[left], height[right])*(right-left);
			if(currWater>maxWater)
			{
				maxWater=currWater;
			}
			else if(height[left]<=height[right])
			{
				left++;

			}
			else
				right--;
		}

		return maxWater;
	}
}
