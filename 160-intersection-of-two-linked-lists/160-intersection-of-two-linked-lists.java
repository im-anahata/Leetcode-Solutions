/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        int size1=0;
        int size2=0;
        while(temp1!=null)
        {
            temp1=temp1.next;
            size1++;
        }
        while(temp2!=null)
        {
            temp2=temp2.next;
            size2++;
        }
        int diff=Math.abs(size1-size2);
        temp1=headA;
        temp2=headB;
        if(size1<size2)
        {
            temp1=headB;
            temp2=headA;
        }
        for(int i=0;i!=diff;i++)
        {
            temp1=temp1.next;
        }
        while(temp1!=temp2 && temp1.next!=null && temp2.next!=null)
        {
            temp1=temp1.next;
            temp2=temp2.next;
        }
        if(temp1==temp2)
        {
            return temp1;
        }
        return null;
    }
}