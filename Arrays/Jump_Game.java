// Approach for solving this problem is a greedy strategy. Here's the reasoning:

// Track the Farthest Reachable Index: Start at the first index and keep track of the farthest index you can reach as you move through the array.

// Iterate through the Array: For each index, check if the current index is reachable (i.e., within the range of your farthest reachable index). If it is, update the farthest reachable index based on the maximum reach possible from this index (i.e., index + nums[index]).

// Early Exit: If, at any point, the farthest reachable index meets or exceeds the last index of the array, you can conclude it's possible to reach the end and return true.

// Unreachable Position Check: If you find an index that’s not reachable (meaning the current index is greater than the farthest reachable index), you can immediately return false, as it indicates there’s no way to move further and reach the end.
//

class Solution {
    public boolean canJump(int[] nums) {
        int farthest=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>farthest)
                return false;
            farthest=Math.max(farthest,i+nums[i]);
            if(farthest>=nums.length-1)
                return true;
            
        }
        return true;
            
    }
}
