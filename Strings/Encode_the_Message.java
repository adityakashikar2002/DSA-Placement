// Problem statement

// You have been given a text message. You have to return the Run-length Encoding of the given message.
// Run-length encoding is a fast and simple method of encoding strings. The basic idea is to represent repeated
// successive characters as the character and a single count. For example, the string "aaaabbbccdaa" would be encoded as "a4b3c2d1a2".

import java.util.* ;
import java.io.*; 
public class Solution {
	public static String encode(String s) {
		if (s == null || s.length() == 0) {
            return "";
        }

        StringBuilder encodedStr = new StringBuilder();
        int count = 1;

        // Iterate over the string, starting from the second character
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;  // Increment count if the character is the same as the previous
            } else {
                // Append the previous character and its count
                encodedStr.append(s.charAt(i - 1)).append(count);
                count = 1;  // Reset the count for the new character
            }
        }

        // Append the last character and its count
        encodedStr.append(s.charAt(s.length() - 1)).append(count);

        return encodedStr.toString();
	}
}
