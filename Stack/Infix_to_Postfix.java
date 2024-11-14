class Solution {
    // Precedence Fn 
    public static int prec(char ch)
        {
            if(ch=='^')
                return 3;
            else if(ch=='*'||ch=='/')
                return 2;
            else if(ch=='+'||ch=='-')
                return 1;
            else
                return -1;
        }
  
    public static String infixToPostfix(String exp) {
        // Your code here
        Stack<Character> st = new Stack<>();
        
        StringBuilder result = new StringBuilder();
        
        for(int i=0;i<exp.length();i++)
        {
            if(exp.charAt(i)>='a'&&exp.charAt(i)<='z' || exp.charAt(i)>='A'&&exp.charAt(i)<='Z' || exp.charAt(i)>='0'&&exp.charAt(i)<='9')
            {
                result.append(exp.charAt(i));
            }
            else if(exp.charAt(i)=='(')
            {
                st.push('(');
            }
            else if(exp.charAt(i)==')'&&st.empty()==false)
            {
                while(st.peek()!='(')
                {
                    result.append(st.pop());
                }
                st.pop();
            }
            else
            {
                while(!st.empty() && prec(exp.charAt(i)) <= prec(st.peek()))
                {
                    result.append(st.pop());
                }
                st.push(exp.charAt(i));
            }
        }
        
        while (!st.empty()) {
            result.append(st.pop());
        }

        return result.toString();
        
    }
}
