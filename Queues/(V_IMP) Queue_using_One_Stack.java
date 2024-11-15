// Algorithm
// 1) Push Operation:
//    Push the element directly onto the stack.

// 2) Pop Operation:
//     If the stack contains only one element, pop it and return it.
//     Otherwise:
//       Recursively pop elements until you reach the bottom of the stack.
//       Store the bottom element.
//       Push back all other elements that were popped during recursion.
//       Return the bottom element as the result of the dequeue operation.

import java.util.Stack;

class QueueUsingSingleStack {
    private Stack<Integer> stack;

    public QueueUsingSingleStack() {
        stack = new Stack<>();
    }

    // Enqueue operation
    public void enqueue(int data) {
        stack.push(data);
    }

    // Dequeue operation
    public int dequeue() throws Exception {
        if (stack.isEmpty()) {
            throw new Exception("Queue is empty");
        }

        // Base case: if only one element is present
        if (stack.size() == 1) {
            return stack.pop();
        }

        // Recursively pop the top element
        int top = stack.pop();
        int result = dequeue();

        // Push the popped element back onto the stack
        stack.push(top);

        return result;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        try {
            QueueUsingSingleStack queue = new QueueUsingSingleStack();
            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            System.out.println(queue.dequeue()); // 1
            queue.enqueue(4);
            System.out.println(queue.dequeue()); // 2
            System.out.println(queue.dequeue()); // 3
            System.out.println(queue.dequeue()); // 4
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
