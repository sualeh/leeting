package us.fatehi.leeting.util;

/**
 * Definition for singly-linked list.
 */
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode of(int... n) {
        if (n == null || n.length == 0) {
            throw new IllegalArgumentException();
        }
        ListNode head = new ListNode(n[0]);
        ListNode current = head;
        for (int i = 1; i < n.length; i++) {
            current.next = new ListNode(n[i]);
            current = current.next;
        }
        return head;
    }

    public boolean equals(Object other) {
        ListNode l1 = this;
        ListNode l2 = (ListNode) other;
        if (l1 == l2)
            return true;
        if (l1 == null || l2 == null)
            return false;
        ListNode c1 = l1;
        ListNode c2 = l2;
        while (c1 != null || c2 != null) {
            if (c1.val == c2.val) {
                c1 = c1.next;
                c2 = c2.next;
            } else {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("[");
        ListNode current = this;
        while (current != null) {
            buffer.append(current.val);
            if (current.next != null) {
                buffer.append(", ");
            }
            current = current.next;
        }
        buffer.append("]");
        return buffer.toString();
    }
}
