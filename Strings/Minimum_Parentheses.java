import java.util.* ;
import java.io.*; 
public class Solution {
	public static int minimumParentheses(String pattern) {
		// Write your code here.
		int i,l=pattern.length();
		int openbrac=0,required=0;
		for(i=0;i<l;i++)
		{
			if(pattern.charAt(i)=='(')
			{
				openbrac++;
			}
			else if(pattern.charAt(i)==')')
			{
				if(openbrac>0)
				{
					openbrac--;
				}
				else
				{
					required++;
				}
			}
		}
		int min=openbrac+required;
		
		return min;
	}
}
