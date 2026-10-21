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
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        if (head != null && head.next == null) {
            return false;
        }
        Set<ListNode> linkSet = new HashSet<>();
        while (head.next != null) {
            if (linkSet.contains(head)) {
                return true;
            }
            linkSet.add(head);
            head = head.next;
        }
        return false;
    }
}
