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
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = null, curr = null;

        if (head == null) {
            return null;
        }

        while (head != null && head.val == val) {
            head = head.next;
        }

        curr = head;

        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else if (curr.val != val) {
                prev = curr;
            }

            curr = curr.next;
        }

        return head;
    }
}
