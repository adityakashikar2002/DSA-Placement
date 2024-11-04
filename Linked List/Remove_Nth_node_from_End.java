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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int len=0,i;
        while(temp!=null)
        {
            temp=temp.next;
            len++;
        }

        if(len==1)
            return null;

        temp=head;
        ListNode prev=head;
        for(i=0;i<len-n;i++)
        {
            prev=temp;
            temp=temp.next;
        }
        if(len==n)
        {
            head=head.next;
        }
        prev.next=temp.next;

        return head;
    }
}
----------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------  

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head,slow=head;
        int i;
        for(i=0;i<n;i++)
            fast=fast.next;

        if(fast==null)
            return head.next;

        while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        
        slow.next=slow.next.next;

        return head; 
        
    }
}
