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
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode sizeHead = head;

        while (sizeHead != null) {
            size++;
            sizeHead = sizeHead.next;
        }
        if (size == 1) return head;
        
        for (int i = 0; i < size / 2; i++) {
            head = head.next;
        }
        return head;
    }
}