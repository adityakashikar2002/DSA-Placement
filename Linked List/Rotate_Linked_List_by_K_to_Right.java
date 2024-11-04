//Approach:
// 1. find the kth node from end using runner technique and do the following modifications

// 2. now we have to update our pointers as

//     a) fast->next will be pointing to head,

//     b)slow->next will be new head,

//     c)last node will be the slow->next hence it should point to null
//---------------------------------------------------------------------
//--------------------------------------------------------------------


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null) {
            return head;
        }

        ListNode temp=head;
        int len=0;

        while(temp!=null)
        {
            temp=temp.next;
            len++;
        }

        k=k%len;
        if(k==0)
            return head;
        

        ListNode fast=head,slow=head;

        for(int i=0;i<k;i++)
        {
            fast=fast.next;
        }
        
        while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }

        fast.next=head;
        head=slow.next;
        slow.next=null;

        return head;
    }
}
