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
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ArrayDeque<ListNode> st = new ArrayDeque<>();
        ListNode pointer = head;
        while (pointer!=null) {
            st.push(pointer);
            pointer = pointer.next;
        }
        head = st.pop();
        pointer = head;
        while(!st.isEmpty()){
            pointer.next = st.peek();

            pointer = st.pop();
        }
        pointer.next = null;
        return head;
    }
}
