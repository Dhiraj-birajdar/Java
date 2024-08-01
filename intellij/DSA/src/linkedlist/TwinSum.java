package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class TwinSum {
    public static void main(String[] args) {
        ListNode head = new ListNode(0,new ListNode(5,new ListNode(4,new ListNode(2,new ListNode(1,new ListNode(0,null))))));
        System.out.println(pairSum(head));
    }
    static public int pairSum(ListNode head) {
        int sum=0;
        ListNode slow, fast;
        List<Integer> li = new ArrayList<>();
        for(slow=head,fast=head.next.next;fast!=null;slow=slow.next,fast=fast.next.next){
            li.add(slow.val);
        }
        li.add(slow.val);
        slow=slow.next;
        for(int i = li.size()-1;slow!=null;slow=slow.next,i--){
            if(sum<li.get(i)+slow.val)
                sum=li.get(i)+slow.val;
        }
        return sum;
    }
}
