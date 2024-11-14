class stack_linkedlist {
    class Node
    {
        int data;
        Node next;


        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    Node top=null;

    public void push(int data)
    {   
        Node node = new Node(data);
        if (top==null) {
            top=node;
            return;
        }
        node.next=top;
        top=node;
    }

    public void peek()
    {
        if (top==null) {
            System.out.println("Stack is Empty!!");
            return;
        }

        System.out.println("\nTop of Stack is: "+top.data);
    }

    public void pop()
    {
        if (top==null) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("\nPopped Ele of Stack is: "+top.data);
        top=top.next;
    }

    public static void main(String[] args) {
        stack_linkedlist st = new stack_linkedlist();
        st.push(5);
        st.push(8);
        st.push(3);
        st.push(2);
        st.push(9);
        st.pop();
        st.peek();
    }
}
