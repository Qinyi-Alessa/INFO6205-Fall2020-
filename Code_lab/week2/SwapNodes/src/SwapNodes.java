public class SwapNodes {
    public ListNode swapNodes (ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode newHead = head.next;
        head.next = swapNodes(head.next.next);
        newHead.next = head;
        return newHead;
    }
}
