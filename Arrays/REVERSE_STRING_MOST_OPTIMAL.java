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

//----------------------------------------
public class ReverseString {
    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverseString(input);
        System.out.println(reversed);  // Output: "olleh"
    }

    public static String reverseString(String s) {
        // Convert string to a character array because strings are immutable in Java
        char[] charArray = s.toCharArray();
        
        int left = 0;
        int right = charArray.length - 1;
        
        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            
            left++;
            right--;
        }
        
        // Convert character array back to string
        return new String(charArray);
    }
}

