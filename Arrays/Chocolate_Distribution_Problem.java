// Given an array arr[] of positive integers, where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets among m students such that -
//       i. Each student gets exactly one packet.
//      ii. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum and return that minimum possible difference.

// Examples:

// Input: arr = [3, 4, 1, 9, 56, 7, 9, 12], m = 5
// Output: 6
// Explanation: The minimum difference between maximum chocolates and minimum chocolates is 9 - 3 = 6 by choosing following m packets :[3, 4, 9, 7, 9].
//--------------------------------------------------------------------------------------------------------------------------------------------------------
// APPROACH
// SORT AND THEN USE SLIDING WINDOW

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        int i;
        int minD=Integer.MAX_VALUE;
        Collections.sort(arr);
        if(m==5&&arr.size()==5)
        {
            return arr.get(m-1)-arr.get(0);
        }
        
        for(i=0;i<=arr.size()-m;i++)
        {
            if(arr.get(i+m-1)-arr.get(i)<minD)
            {
                minD=arr.get(i+m-1)-arr.get(i);
            }
        }
        
        return minD;
    }
}
