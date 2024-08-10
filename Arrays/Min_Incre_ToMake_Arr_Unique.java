class minIncreToMakeArrUnique {
    public int minIncrementForUnique(int[] nums) {
        int count=0;
        int n=nums.length;

        Arrays.sort(nums);

        for(int i=1;i<n;i++)
        {
            if(nums[i]<=nums[i-1])
            {
                count=count+ nums[i-1] + 1 - nums[i];
                nums[i]=nums[i-1]+1;
            }
        }

        return count;
       
    }
}
