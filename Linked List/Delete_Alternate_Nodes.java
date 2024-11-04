/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public void deleteAlt(Node head) {
        // Code Here
        if(head==null) // If node empty simply return
        {
            return;
        }
        Node curr=head;
        Node prev=null;
        
        while(curr!=null)
        {
            prev=curr;
            curr=curr.next;
            if(curr==null)  // case for only 2 nodes if 2nd empty simply return;
                return;
            prev.next=curr.next;
            curr=prev.next;
        }
        
    }
}
