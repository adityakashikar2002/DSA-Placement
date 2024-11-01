class Solution {
    // Function to reverse a linked list.
    Node reverseList(Node head) {
        // code here
        
        if(head==null)
            return head;
        Node curr=head,prev=null,next=null;
        
        while(curr!=null)
        {
            next=curr.next; //ncn
            curr.next=prev; //cnp
            prev=curr;      //pc
            curr=next;      //cn
        }
        
        return prev;        //return p
    }
}
