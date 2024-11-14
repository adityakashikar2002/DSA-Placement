// Precedence(Curr_Input_Char) < Precedence(Char_In_Stack) then pop and later push


// Java program to convert infix to prefix
import java.util.*;

class infix_to_prefix {
	
	public static int prec(char c)
	{
		if(c=='^')
			return 3;
		else if(c=='*'||c=='/')
			return 2;
		else if(c=='+'||c=='-')
			return 1;
		else 
			return -1;
	}
	
	public static String infixToPrefix(String s)
	{
		String prefix="";
		Stack<Character> st = new Stack<>();
		StringBuilder result = new StringBuilder();
		
		int l=s.length();
		
		for(int i=l-1;i>=0;i--)
		{
			char ch = s.charAt(i);
			
			if(ch>='a'&&ch<='z' || ch>='A'&&ch<='Z' || ch>='0'&&ch<='9')
			{
				result.append(ch);
			}
			else if(ch==')')
				st.push(')');
			else if(ch=='('&&st.empty()==false)
			{
				while(ch!=')')
				{
					result.append(st.pop());
				}
				st.pop();
			}
			else
			{
				while(!st.empty() && prec(ch) < prec(st.peek()))
				{
					result.append(st.pop());
				}
				st.push(ch);
			}
		}
		
		while(!st.empty())
		{
			result.append(st.pop());
		}
		
		prefix=result.reverse().toString();
		
		return prefix;
	}
	
	// Driver code
	public static void main(String[] args)
	{
		String s = ("x+y*z/w+u");

		// Function call
		System.out.print(infixToPrefix(s));
	}
}

