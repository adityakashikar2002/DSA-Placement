class stack_array
{
    int[] Stack = new int[5];
    int top=-1;
    int MAX=Stack.length;

    public void push(int data)
    {
        if(top==MAX-1)
        {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        Stack[top]=data;
    }

    public void pop()
    {
        if(top==MAX-1)
        {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("\nPopped item is "+Stack[top]);
        Stack[top]=0;
        top--;
    }

    public void peek()
    {
        if (top==-1) {
            System.out.println("Stack is Empty!!");
            return;
        }
        System.out.println("\nTop Ele is: "+Stack[top]);
    }

    public void show()
    {
        for(int i=0;i<Stack.length;i++)
            System.out.print(Stack[i]+" ");
    }

    public static void main(String[] args) {
        stack_array st = new stack_array();
        st.push(6);
        st.push(2);
        st.push(9);
        st.show();
        st.pop();
        st.show();
        st.pop();
        st.show();
        st.peek();
    }
}
