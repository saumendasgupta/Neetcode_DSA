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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode head = new ListNode();
        ListNode dummyhead = new ListNode();
        dummyhead.next=head;
        if(head1==null)
           return list2;
        if(head2==null)
           return list1;
        while(head1!=null && head2!=null){
               if(head1.val<head2.val){
                  //head.val = head1.val;
                  head.next = head1;
                  //head=head.next;
                  head1 = head1.next;
               }else{
                  //head.val = head2.val;
                  head.next = head2;
                  //head=head
                  head2 = head2.next;
               }
               head=head.next;
        }
        if(head1!=null) head.next=head1;
        if(head2!=null) head.next=head2;
        head = dummyhead.next;
        return head.next;      

    }
}
