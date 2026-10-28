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
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode left = dummy, right = dummy;
        for (int i = 0; i < n; i++) {
            if (right.next != null) {
                right = right.next;
            } else {
                return head;
            }
        }

        while (right.next != null) {
            right = right.next;
            left = left.next;
        }
        System.out.println("check pointers");

        left.next = left.next.next;

        return dummy.next;
    }
}
