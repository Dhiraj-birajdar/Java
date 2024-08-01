package linkedlist;


public class LinkedListGCDBetween {
    public static void main(String[] args) {
        ListNode head = new ListNode(2,new ListNode(4,new ListNode(1,new ListNode(100,new ListNode(50,null)))));
        head = insertGreatestCommonDivisors(head);
        printLinkedList(head);

    }
    public static void printLinkedList(ListNode head){
        for(;head!=null;head=head.next)
            System.out.print(head.val+" -> ");
    }
    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode n1 = head, n2 = head.next, gcd;
        while (n2 != null){
            gcd = new ListNode(gcd(n1.val, n2.val),n2);
            n1.next = gcd;
            n1 = n2;
            n2 = n2.next;
        }
        return head;
    }

    static public int gcd(int a,int b){
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
}
