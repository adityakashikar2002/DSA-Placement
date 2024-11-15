class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    // Your code here	
	    q2.add(a);
	    
	    while(!q1.isEmpty())
	    {
	        q2.add(q1.peek());
	        q1.remove();
	    }
	    
	    Queue<Integer> temp = q1;
	    q1=q2;
	    q2=temp;
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
	    // Your code here
	    if (q1.isEmpty()) {
            return -1;  // Indicate that the stack is empty.
        }
	    return q1.remove();
    }
	
}
//---------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------

class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        // Add the new element to q2
        q2.add(x);
        // Transfer all elements from q1 to q2 to maintain the LIFO order
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        // Swap q1 and q2 so that q1 always contains the current stack elements
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    
    public int pop() {
        // Remove the top element from q1
        return q1.remove();
    }
    
    public int top() {
        // Peek at the top element of q1
        return q1.peek();
    }
    
    public boolean empty() {
        // Check if q1 is empty
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
