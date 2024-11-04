//Approach: Find middle using fast slow and reverse 2nd half compare 1st half with 2nd half

//----------------------------------------------------------------------------------------------------
/* Structure of class Node is
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        // Your code here
        Node fast=head,slow=head;
        
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        int len=0;
        Node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            len++;
        }
        
        Node head2=null;
        if(len%2==0)
            head2=slow;
        else
            head2=slow.next;
            
        Node curr=head2,prev=null,next=null;
        
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        head2=prev;
        while(head!=null&&head2!=null)
        {
            if(head.data!=head2.data)
                return false;
            head=head.next;
            head2=head2.next;
        }
        
        return true;
    }
}
