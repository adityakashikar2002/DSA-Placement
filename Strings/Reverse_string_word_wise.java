// Problem statement
// Reverse the given string word-wise. The last word in the given string should come at 1st place, 
// the last-second word at 2nd place, and so on. Individual words should remain as it is.

import java.util.Scanner;

class Solution {

    static String reverseStringWordWise(String input) {
        // Write your code here
        String arr[]=input.split("\\s");
        int j=arr.length-1;
        input="";
        while(j>=0)
        {
            input+=arr[j--];
            input+=" ";
        }
        return input;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}
