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
		ListNode dummy = new ListNode(0);
		dummy.next = head;

		ListNode idx1 = dummy;
		ListNode idx2 = dummy;
		for (int i = 0; i < n + 1; i++) {
			idx1 = idx1.next;
		}
		while (idx1 != null) {
			idx1 = idx1.next;
			idx2 = idx2.next;
		}

		idx2.next = idx2.next.next;

		return dummy.next;
	}
}