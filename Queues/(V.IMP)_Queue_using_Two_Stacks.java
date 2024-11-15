class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
	   // Your code here
	    s1.push(x);
	    
    }
	
    
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
	   // Your code here
	    
	   if(s1.empty()&&s2.empty())
	   {
	       return -1;
	   }
	   else if(s2.isEmpty())
	   {
	       while(!s1.isEmpty())
	       {
	            s2.push(s1.pop());
	       }
	   }
	   return s2.pop();
    }
}

//-----------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------
class Queue
{
    Stack<Integer> input = new Stack<Integer>(); 
    Stack<Integer> output = new Stack<Integer>(); 
    
    /*The method pop which return the element poped out of the stack*/
    int dequeue()
    {
	    // Your code here
	    if(input.empty())
	        return -1;
	    else
	    {   
          int pop=input.peek();  // always return inputs top element
	        input.pop();
	        return pop;
	    }
	    
    }
	
    /* The method push to push element into the stack */
    void enqueue(int x)
    {
	    // Your code here
	    while(!input.empty())          // if input not empty push all elements to output then add curr ele to be pushed to input 
	    {
	        output.push(input.pop());
	    }
	    
	    input.push(x);                  // if input empty simply push to input
	    
	    while(!output.empty())          // put original push back to input this will keep top ele and front in stack....
	    {
	        input.push(output.pop());
	    }
    }
}

//-------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------------------------
// 232. Implement Queue using Stacks
// Solved
// Easy
// Topics
// Companies
// Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).

// Implement the MyQueue class:

// void push(int x) Pushes element x to the back of the queue.
// int pop() Removes the element from the front of the queue and returns it.
// int peek() Returns the element at the front of the queue.
// boolean empty() Returns true if the queue is empty, false otherwise.
// Notes:

// You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
// Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.
 

// Example 1:

// Input
// ["MyQueue", "push", "push", "peek", "pop", "empty"]
// [[], [1], [2], [], [], []]
// Output
// [null, null, null, 1, 1, false]

// Explanation
// MyQueue myQueue = new MyQueue();
// myQueue.push(1); // queue is: [1]
// myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
// myQueue.peek(); // return 1
// myQueue.pop(); // return 1, queue is [2]
// myQueue.empty(); // return false
//----------------------------------------------------------------------------------------------

//Optimized Approach for Amortized O(1)
// Optimization
// A more efficient approach is to only use p2 when you need to pop or peek. Here's an optimized version:

// 1) For push(x), simply push x to p1 directly.
// 2) For pop() and peek(), if p2 is empty, transfer all elements from p1 to p2, which reverses the order to give the correct FIFO behavior.

class MyQueue {

    Stack<Integer> p1 = new Stack<>();
    Stack<Integer> p2 = new Stack<>();
    
    public MyQueue() {
        // Constructor
    }
    
    public void push(int x) {
        p1.push(x);
    }
    
    public int pop() {
        if (p2.isEmpty()) {
            while (!p1.isEmpty()) {
                p2.push(p1.pop());
            }
        }
        return p2.pop();
    }
    
    public int peek() {
        if (p2.isEmpty()) {
            while (!p1.isEmpty()) {
                p2.push(p1.pop());
            }
        }
        return p2.peek();
    }
    
    public boolean empty() {
        return p1.isEmpty() && p2.isEmpty();
    }
}
