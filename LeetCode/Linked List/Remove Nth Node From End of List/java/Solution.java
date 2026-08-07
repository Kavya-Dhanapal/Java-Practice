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
        int count=0;
        int i=1;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if (count == n) {
            return head.next;
        }

        temp=head;
        while(temp!=null && i<=count){
            if((count-i)==n){
                temp.next=temp.next.next;
            }
            else{
            temp=temp.next;
          
            }
              i++;
        }
        return head;
    }
}