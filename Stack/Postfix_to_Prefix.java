// Java Program to convert Postfix to Prefix
import java.util.*;

class postfix_to_prefix {

	public static boolean isOperator(char c)
	{
		switch(c)
		{
			case '+':
			case '-':
			case '*':
			case '/':
			case '^':
				return true;
			
		}
		
		return false;
	}
	
	public static String postToPre(String s)
	{
		String prefix="";
		
		StringBuilder str = new StringBuilder();
		Stack<String> st = new Stack<>();
		
		int l=s.length();
		
		for(int i=0;i<l;i++)
		{
			char c = s.charAt(i);
			if(isOperator(c))
			{
				String op1=st.pop();
				String op2=st.pop();
				String temp = c+op2+op1;
				st.push(temp);
			}
			else
			{
				st.push(c+""); // because 'c' is Character
			}
		}
		
		
		return st.pop(); // IMP STEP because only one expression will be left
	}
	
	// Driver Code
	public static void main(String args[])
	{
		String post_exp = "ABC/-AK/L-*";
		System.out.println("Postfix : "+ post_exp);
		// Function call
		System.out.println("Prefix : "+ postToPre(post_exp));
	}
}

// This code is contributed by Arnab Kundu
