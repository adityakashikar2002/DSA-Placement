// Approach:
// 1) Sort the Array: First, sort the array in ascending order. Sorting helps us identify the smallest and largest elements.

// 2) Arrange Elements Alternately: To maximize the absolute differences, we can alternate the smallest and largest elements.
// The idea is to place the smallest element, then the largest, then the second smallest, and so on. This “zig-zag” pattern maximizes differences between adjacent elements.

// 3) Calculate the Sum: After rearranging, calculate the sum of absolute differences between consecutive elements in this new order, 
// considering the circular nature of the array (so the last element should connect back to the first).
class Solution {
    public long maxSum(Long[] arr) {
        // code here
         // Step 1: Sort the array
        Arrays.sort(arr);
        
         // Step 2: Rearrange elements in max-min order
        int i,n=arr.length;
        int left=0,right=n-1;
        
        Long[] temp = new Long[arr.length];
        for(i=0;i<n;i++)
        {
            if(i%2==0)
            {
                temp[i]=arr[right--];
            }
            else
            {
                temp[i]=arr[left++];
            }
        }
        
        // Step 3: Calculate the sum of absolute differences
        long mSum=0;
        for(i=0;i<temp.length-1;i++)
        {
            mSum+=Math.abs(temp[i]-temp[i+1]);
        }
        //Add Circular Sum
        mSum+=Math.abs(temp[temp.length-1]-temp[0]);
        
        return mSum;
    }
}
