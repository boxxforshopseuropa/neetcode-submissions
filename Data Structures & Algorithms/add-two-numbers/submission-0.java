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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode res = new ListNode(0);
        ListNode loop = res;

        int extra = 0;
        while (l1 != null || l2 != null) {
            int l1Val = 0, l2Val = 0;
            if (l1 != null) {
                l1Val = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                l2Val = l2.val;
                l2 = l2.next;
            }
            int sum = l1Val + l2Val + extra;
            if (sum >= 10) {
                sum = sum % 10;
                if (extra == 0) {
                    extra++;
                }
            } else {
                if (extra > 0) {
                    extra--;
                }
            }
            loop.next = new ListNode(sum);
            loop = loop.next;
        }
        if (extra > 0) {
            loop.next = new ListNode(extra);
        }

        return res.next;
    }
}
