import java.util.List;
public class Partition {
    public ListNode partition(ListNode head, int target){
        if(head == null || head.next == null){
            return head;
        }
        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);
        ListNode curSmall = small;
        ListNode curLarge = large;
        while (head != null){
            if(head.val < target) {
                curSmall.next = head;
                curSmall = curSmall.next;
            }
            else{
                curLarge.next = head;
                curLarge = curLarge.next;
            }
            head= head.next;
        }
        curSmall.next = large.next;
        curLarge.next = null;
        return small.next;
    }
    public static void main(String[] args)
    {
        Partition list = new Partition();
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next = new ListNode(7);
        while (head != null) {
            System.out.print(list.partition(head, 3).val);
            head = head.next;
        }
    }
}
