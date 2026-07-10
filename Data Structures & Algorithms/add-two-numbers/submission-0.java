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
        ListNode dummy = new ListNode(0); // A placeholder to start the new list
        ListNode curr = dummy;            // This moves as we add nodes
        int carry = 0;

        // Keep going as long as there are numbers OR a leftover carry
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; // Start with the carry from the last step
            
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;            // Get the "tens" digit (e.g., 15 / 10 = 1)
            curr.next = new ListNode(sum % 10); // Get the "ones" digit (e.g., 15 % 10 = 5)
            
            curr = curr.next;            // Move our new list pointer forward
        }

        return dummy.next;
    }
}
