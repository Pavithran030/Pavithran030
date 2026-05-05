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

        if(k==0 || head==null || head.next==null) return head;

        int len=1;
        ListNode tail=head;

        while(tail.next!=null){
            tail=tail.next;
            len+=1;
        }

        k=k%len;

        if(k==0) return head;
        tail.next=head;
        ListNode current =head;

        for(int i=0;i<len-k-1;i++){
            current=current.next;
        }
        ListNode newhead=current.next;
        current.next=null;
        

        return newhead;
    }
}
