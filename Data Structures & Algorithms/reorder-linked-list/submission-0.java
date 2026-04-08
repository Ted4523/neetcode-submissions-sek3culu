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
    public void reorderList(ListNode head) {
        ListNode right = head;
        int r = 0;
        ListNode mid = head;
        while(right!=null && right.next!=null){
            right = right.next.next;
            mid = mid.next;
        }

        ListNode prev = null;
        ListNode curr = mid;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode pointer1 = head;
        ListNode pointer2 = prev;

        while(pointer2.next!=null){
            ListNode next1 = pointer1.next;
            ListNode next2 = pointer2.next;
            pointer1.next = pointer2;
            pointer2.next = next1;
            pointer1 = next1;
            pointer2 = next2;
        }

    }
}
