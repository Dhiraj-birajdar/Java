package linkedlist;

public class MergeNodes {
    public static void main(String[] args) {
        ListNode head = new ListNode(0,new ListNode(4,new ListNode(1,new ListNode(0,new ListNode(50,new ListNode(0,null))))));
        head = mergeNodes(head);
        printLinkedList(head);
    }

    public static ListNode mergeNodes(ListNode head) {
        int sum = 0;
        ListNode n1 = head,n2=n1.next,temp=null;
        while(n2 != null){
            sum = 0;
            while(n2.val !=0){
                sum+=n2.val;
                n2 = n2.next;
            }
            n1.val = sum;
            temp = n1;
            n1 = n1.next;
            n2 = n2.next;
        }
        temp.next = null;
        return head;
    }

    public static void printLinkedList(ListNode head){
        for(;head!=null;head=head.next)
            System.out.print(head.val+" -> ");
    }
}
