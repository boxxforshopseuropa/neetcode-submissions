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
        if (head.next == null) {
            return;
        }
        ListNode curr = head;
        Deque<ListNode> deque = new ArrayDeque<>();
        while (curr != null) {
            deque.add(curr);
            curr = curr.next;
        }
        curr = head;
        ListNode last = null;
        while (curr.next != last) {
            ListNode tmp = curr.next;
            last = deque.getLast();
            curr.next = last;
            last.next = tmp;

            deque.removeLast();
            curr = curr.next.next;
        }
        curr.next = null;
    }
}
