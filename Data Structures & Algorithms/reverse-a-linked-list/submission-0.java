
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;   // Initially, there is no previous node
        ListNode curr = head;   // Start at the beginning of the list

        while (curr != null) {
            ListNode nextTemp = curr.next; // 1. Save the next node
            curr.next = prev;              // 2. Flip the pointer backward
            prev = curr;                   // 3. Move 'prev' one step forward
            curr = nextTemp;               // 4. Move 'curr' one step forward
        }

        // After the loop, 'prev' is the new head of the reversed list
        return prev;
    }
}
