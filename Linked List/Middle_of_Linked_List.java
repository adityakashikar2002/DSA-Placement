// Approach use 2 pointers(p1 move by 1 and p2 move by 2, by the time p2 reaches end p1 will point to middle ele )
/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    int getMiddle(Node head) {
        // Your code here.
        Node ptr1=head,ptr2=head;
        
        while(ptr2!=null&&ptr2.next!=null)
        {
            ptr1=ptr1.next;
            ptr2=ptr2.next.next;
        }
        
        return ptr1.data;
    }
}
