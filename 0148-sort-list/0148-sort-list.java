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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        int length = getLength(head);
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        for (int i = 1; i < length; i *= 2) {
            ListNode prev = dummy;
            ListNode curr = dummy.next;

            while (curr != null) {
                ListNode left = curr;
                ListNode right = split(left, i);

                curr = split(right, i);
                prev.next = merge(left, right);

                while (prev.next != null) {
                    prev = prev.next;
                }
            }
        }

        return dummy.next;
    }

    private int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            head = head.next;
            length++;
        }
        return length;
    }

    private ListNode split(ListNode head, int step) {
        if (head == null) return null;
        for (int i = 1; i < step && head.next != null; i++) {
            head = head.next;
        }
        ListNode second = head.next;
        head.next = null;
        return second;
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;

        while (left != null && right != null) {
            if (left.val < right.val) {
                p.next = left;
                left = left.next;
            } else {
                p.next = right;
                right = right.next;
            }
            p = p.next;
        }
        // 남은 부분 연결
        if (left != null) p.next = left;
        if (right != null) p.next = right;

        return dummy.next;
    }
}