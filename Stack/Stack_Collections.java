import java.util.*;
public class stack_class {
	public static void main(String args[])
	{
		Stack<Integer> st = new Stack<>();
		
		System.out.println(st.empty()); // checks if empty
		
		st.push(5);
		st.push(8);
		st.push(9);
		st.push(1);
		
		for(int i=0;i<st.size();i++)        // size of stack
			System.out.print(st.get(i)+" ");
		
		                          // pops the topmost ele
		System.out.println("\nPopped Element: "+st.pop());
		
		for(int i=0;i<st.size();i++)
			System.out.print(st.get(i)+" ");
		
		System.out.println();
		
		System.out.print(st.contains(8));   // check if any ele present in stack
		
		System.out.println();
		
		System.out.println(st.empty());
		
		System.out.println();
		
		System.out.println(st.peek());  // return topmost ele
		
		
		
	}
}
