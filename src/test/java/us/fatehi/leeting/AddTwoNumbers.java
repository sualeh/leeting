package us.fatehi.leeting;

import org.junit.jupiter.api.Test;
import us.ListNode;

/**
 * Add Two Numbers
 * 
 * Linked List
 * 
 * https://leetcode.com/problems/add-two-numbers/
 */
public class AddTwoNumbers {

    @Test
    public void maintest() {

        AddTwoNumbers add = new AddTwoNumbers();

        ListNode sum1 = add.addTwoNumbers(ListNode.of(2, 4, 3), ListNode.of(5, 6, 4));
        boolean checkEquals1 = ListNode.checkEquals(sum1, ListNode.of(7, 0, 8));
        System.out.println(checkEquals1);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode lc1 = l1;
        ListNode lc2 = l2;
        ListNode newNumber = null;
        ListNode newCurrent = null;
        int carryOver = 0;
        while (lc1 != null || lc2 != null) {
            int sum = carryOver;
            carryOver = 0;
            if (lc1 != null) {
                sum = sum + lc1.val;
                lc1 = lc1.next;
            }
            if (lc2 != null) {
                sum = sum + lc2.val;
                lc2 = lc2.next;
            }
            if (sum > 9) {
                sum = sum % 10;
                carryOver = 1;
            }
            ListNode newNode = new ListNode(sum);
            if (newNumber == null) {
                newNumber = newNode;
            }
            if (newCurrent == null) {
                newCurrent = newNode;
            } else {
                newCurrent.next = newNode;
                newCurrent = newCurrent.next;
            }
        }
        if (carryOver == 1) {
            newCurrent.next = new ListNode(1);
        }
        return newNumber;
    }

}
