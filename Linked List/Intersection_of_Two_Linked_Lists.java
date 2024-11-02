// Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.
// "intersection" refers to a shared node reference in memory, not a node with the same value. For an intersection to be detected, both headA and headB must reference the same exact node instance in memory.

//APPROACHES: Both pointers for two lists must travel same distance/nodes from a point in order to point to common node;
//1) Skip the nodes for long list and then find the same:
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       ListNode ptrA=headA;
       ListNode ptrB=headB;

       int i;
       int lenA=0,lenB=0;
       int skip=0;
       while(ptrA!=null)
       {
           lenA++;
           ptrA=ptrA.next;
       }
       while(ptrB!=null)
       {
           lenB++;
           ptrB=ptrB.next;
       }

       ptrA = headA;
       ptrB = headB;
       
       if(lenA>lenB)
       {
            skip=lenA-lenB;
            while(skip-->0)
            {
                ptrA=ptrA.next;
            }
       }
       else if(lenB>lenA)
       {
            skip=lenB-lenA;
            while(skip-->0)
            {
                ptrB=ptrB.next;
            }
       }

        while(ptrA!=ptrB)
        {
            ptrA=ptrA.next;
            ptrB=ptrB.next;
        }

        return ptrA;
    }
}
//2) Use the concise one paas two pointer approach (A reaches end make it point to B's head and vice-versa)
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       ListNode ptrA=headA;
       ListNode ptrB=headB;

       while(ptrA!=ptrB)
       {
            ptrA = ptrA==null ? headB : ptrA.next;
            ptrB = ptrB==null ? headA : ptrB.next;
       }
       return ptrA; 
    }
}
