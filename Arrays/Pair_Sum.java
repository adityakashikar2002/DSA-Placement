//You are given an array/list ‘ARR’ consisting of ‘N’ distinct integers arranged in ascending order.
//You are also given an integer ‘TARGET’. Your task is to count all the distinct pairs in ‘ARR’ such that their sum is equal to ‘TARGET’.

//Note:

//1. Pair (x,y) and Pair(y,x) are considered as the same pair. 

//2. If there exists no such pair with sum equals to 'TARGET', then return -1.

//Time: O(N)
//Space: O(1)

import java.util.* ;
import java.io.*; 
public class Pair_Sum {
    public static int pairSum(int arr[], int n, int target) {
        // Write your code here.
        int i=0,j=n-1;
        int sum=0,count=0;
        while(i<j)
        {
            sum=arr[i]+arr[j];
            if(sum==target)
            {
                i++;
                j--;
                count++;
            }
            else if(sum<target)
                i++;
            else if(sum>target)
                j--;
        }
        
        return count>0?count:-1;
    }
}
//-----------------------------------------------------------------------
//-----------------------------------------------------------------------
//MOST OPTIMAL SOLUTION IN CASE OF NON-UNIQUE ELEMENTS AND UNSORTED ARRAY ELEMENTS Time: O(N) Space: O(N)
//-----------------------------------------------------------------------
import java.util.HashSet;

public class PairSum {
    public static int countUniquePairs(int[] arr, int target) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<String> pairs = new HashSet<>();
        int count = 0;
        
        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                String pair = num < complement ? num + "," + complement : complement + "," + num;
                if (!pairs.contains(pair)) {
                    count++;
                    pairs.add(pair);
                }
            }
            seen.add(num);
        }
        
        return count > 0 ? count : -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2};
        int target = 3;
        System.out.println(countUniquePairs(arr, target));  // Output: 1
    }
}
