// Reverse of a STRING MOST OPTIMAL

import java.util.* ;
import java.io.*; 

class Solution {

  public static String stringReverse(char[] arr) {
    // Write your code here.
    int n = arr.length;
    String rse="";
    for(int i=0;i<n;i++)
      rse=arr[i]+rse;
    
    return rse;
  }
}
