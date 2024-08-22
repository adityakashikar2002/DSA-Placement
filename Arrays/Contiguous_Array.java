//Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
//Hint:- Treat 0 as -1 as make it Longest Subarray Zero Sum Problem
class Contiguous_Array {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
		int i;
		int csum=0,maxLen=0;

		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(0, -1);

		for(i=0;i<n;i++)
		{
			csum+=nums[i]==1?1:-1;

			if(map.containsKey(csum))
			{
				maxLen=Math.max(maxLen, i-map.get(csum));
			}
			else
			{
				map.put(csum, i);
			}
		}

		return maxLen;
    }
}
