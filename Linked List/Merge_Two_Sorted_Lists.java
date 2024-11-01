class Solution {
    // Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
        // This is a "method-only" submission.
        // You only need to complete this method
        if(head1==null&&head2!=null)
            return head2;
        if(head2==null&&head1!=null)
            return head1;
        
        Node head;
        if(head1.data<=head2.data)
        {
            head=head1;
            head1=head1.next;
        }
        else
        {
            head=head2;
            head2=head2.next;
        }
        
        Node curr=head;
        
        while(head1!=null&&head2!=null)
        {
            if(head1.data<=head2.data)
            {
                curr.next=head1;
                head1=head1.next;
            }
            else
            {
                curr.next=head2;
                head2=head2.next;
            }
            curr=curr.next;
        }
        
        if(head1==null&&head2!=null)
        {
            curr.next=head2;
        }
        if(head1!=null&&head2==null)
        {
            curr.next=head1;
        }
        
        return head;
        
    }
}
