import java.util.List;

public class DeleteDuplicates {
    public ListNode deleteDuplicates (ListNode head){
        ListNode cur = head;
        while (cur != null && cur.next != null){
            if(cur.next.val ==cur.val){
                cur.next = cur.next.next;
            }
            else{
                cur = cur.next;
            }
        }
        return head;
    }
    public static void main(String[] args)
    {
        DeleteDuplicates list = new DeleteDuplicates();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);

        while (head!= null) {
            System.out.print(list.deleteDuplicates(head).val);
            head = head.next;
        }
    }
}
