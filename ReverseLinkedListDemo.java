package interviewquestion;

public class ReverseLinkedListDemo {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode p = head;
        ListNode next = p.next;
        while (next != null) {
            ListNode temp = next.next;
            next.next = p;
            p = next;
            next = temp;
        }
        head.next = null;
        return p;
    }

    public ListNode reverseListRecursion(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode newHead = recursion(head);
        head.next = null;
        return newHead;
    }
    /**
     * The recursive solution
     */
    public ListNode recursion(ListNode p) {
        if (p.next == null) {
            return p;
        } else {
            ListNode next = p.next;
            ListNode newHead = recursion(next);
            next.next = p;
            return newHead;
        }
    }
}


  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
