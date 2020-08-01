package interviewquestion;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 *
 * Example:
 *
 * Input:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * Output: 1->1->2->3->4->4->5->6
 */
 class _ListNode {
      int val;
     _ListNode next;
     _ListNode() {}
     _ListNode(int val) { this.val = val; }
     _ListNode(int val, _ListNode next) { this.val = val; this.next = next; }
  }

public class MergeKLists {
    public _ListNode mergeKLists(_ListNode[] lists) {
        PriorityQueue<_ListNode> heap = new PriorityQueue((Comparator<_ListNode>) (o1, o2) -> o1.val - o2.val);

        for (_ListNode node : lists) {
            if (node != null) {
                heap.offer(node);
            }
        }

        _ListNode pre = new _ListNode(-1);
        _ListNode temp = pre;
        while (!heap.isEmpty()) {
            _ListNode curr = heap.poll();
            temp.next = new _ListNode(curr.val);
            if (curr.next != null) {
                heap.offer(curr.next);
            }
            temp = temp.next;
        }
        return pre.next;
    }

}


