class Rearrange_Arr_Elements_by_Sign {
    public int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];
        int i,posIndex=0,negIndex=1;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)
            {
                res[posIndex]=nums[i];
                posIndex+=2;
            }
            else
            {
                res[negIndex]=nums[i];
                negIndex+=2;
            }
        }

        return res;
    }
}
