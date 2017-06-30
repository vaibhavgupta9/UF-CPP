/**
 * Created by Michael on 06/15/2017
 * Time complexity:O(n) Space Complexty:O(1)
 *
 */
public class Michael_ReverseKGroupSolution {
    public ListNode reverseKGroup ( ListNode head, int k) {
        if (head == null || k <= 1) {
               return head;
        } 

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        head = dummy;
        while (head.next != null) {
                 head = reverseNextK(head, k);
        }

        return dummy.next;
    }

private ListNode reverseNextK(ListNode head, int k) {
    ListNode next = head;
    for (int i = 0; i < k; i++) {
        if (next.next == null) {
            return next;
        }
        next = next.next;
    }

    ListNode n1 = head.next;
    ListNode prev = head, curt = n1;
    for (int i = 0; i < k; i++) {
        ListNode temp = curt.next;
        curt.next = prev;
        prev = curt;
        curt = temp;
    }
    n1.next = curt;
    head.next = prev;
    return n1;
    }
}