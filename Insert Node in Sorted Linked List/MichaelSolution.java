/**
 * O(N) time, O(1) space
 */
class ListNode {
  int val;
  ListNode next;
  ListNode(int x) {
          val = x;
          next = null;
  }
}

public class MichaelSolution {
  public ListNode insert(ListNode node, int x) {
    if (node == null) {
         node = new ListNode(x);
         node.next = node;
         return node;
    }

    ListNode p = node;
    ListNode prev = null;
    do {
          prev = p;
          p = p.next;
          if (x <= p.val && x >= prev.val) {
                  break;
          }
          if ((prev.val > p.val) && (x < p.val || x > prev.val)) {
                  break;
          }
    } while (p != node);

    ListNode newNode = new ListNode(x);
    newNode.next = p;
    prev.next = newNode;
    return newNode;
  }
}

