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
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode res = null;
        ListNode resIndex = res;
        while (list1 != null && list2 != null) {
            ListNode toAdd;
            if (list1.val <= list2.val) {
                ListNode tmp = list1.next;
                toAdd = list1;
                toAdd.next = null;
                list1 = tmp;
            } else {
                ListNode tmp = list2.next;
                toAdd = list2;
                toAdd.next = null;
                list2 = tmp;
            }
            if (res == null) {
                resIndex = toAdd;
                res = resIndex;
            } else {
                resIndex.next = toAdd;
                resIndex = resIndex.next;
            }
        }

        if (list1 == null) {
            resIndex.next = list2;
        } else {
            resIndex.next = list1;

        }

        return res;
    }
}