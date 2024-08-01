package linkedlist;

import java.math.BigInteger;

public class AddTwoNumLinkedList {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(9, null);
        ListNode n2 = new ListNode(1, new ListNode(9, null));
        printLinkedList(addTwoNumbers(n1, n2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, temp = null ;

        int carry, num = 0;
        for (carry = 0; l1 != null || l2 != null; temp = temp.next) {
            if (l1 != null && l2 != null) {
                num = l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 == null) {
                num = l2.val + carry;
                l2 = l2.next;
            } else if (l2 == null) {
                num = l1.val + carry;
                l1 = l1.next;
            }
            temp = new ListNode();
            if(head==null) head = temp;
            temp.val = num % 10;
            carry = num / 10;
        }
        if (carry != 0)
            temp = new ListNode(carry,null);
        return head;
    }

    public static ListNode addTwoNumbersBrute(ListNode l1, ListNode l2) {
        BigInteger sum = BigInteger.ZERO, n1 = BigInteger.ZERO, n2 = BigInteger.ZERO, mul = BigInteger.ONE;
        while (l1 != null) {
            n1 = n1.add(mul.multiply(BigInteger.valueOf(l1.val)));
            mul = mul.multiply(BigInteger.valueOf(10));
            l1 = l1.next;
        }
        mul = BigInteger.ONE;
        while (l2 != null) {
            n2 = n2.add(mul.multiply(BigInteger.valueOf(l2.val)));
            mul = mul.multiply(BigInteger.valueOf(10));
            l2 = l2.next;
        }
        sum = n2.add(n1);
        System.out.println(sum);
        l1 = new ListNode(Integer.parseInt(sum.mod(BigInteger.TEN).toString()), null);
        l2 = l1;
        sum = sum.divide(BigInteger.TEN);
        while (!sum.equals(BigInteger.ZERO)) {
            l1.next = new ListNode();
            l1 = l1.next;
            l1.val = Integer.parseInt(sum.mod(BigInteger.TEN).toString());
            sum = sum.divide(BigInteger.TEN);
        }
        return l2;
    }

    public static void printLinkedList(ListNode head) {
        for (; head != null; head = head.next)
            System.out.print(head.val + " -> ");
        System.out.print("\b\b\b");
    }
}
