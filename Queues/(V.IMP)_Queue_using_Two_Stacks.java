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
