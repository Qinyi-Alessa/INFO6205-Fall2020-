import java.util.List;
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd (ListNode head, int n){
        ListNode dummy = new ListNode (0);
        dummy.next = head;
        int length = 0;
        ListNode cur = head;
        while (cur != null){
            length++;
            cur = cur.next;
        }
        length = length - n;
        cur= dummy;
        while (length > 0){
            length--;
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return dummy.next;
    }
    public static void main(String[] args)
    {
        RemoveNthFromEnd list = new RemoveNthFromEnd();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int n =2;
        ListNode word = list.removeNthFromEnd(head,n);

        while (word!= null) {
            System.out.print(word.val);
            word = word.next;
        }
    }
}
