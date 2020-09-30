public class ReorderList {
    public ListNode reorderList(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode mid = midNode (head);
        ListNode one = head;
        ListNode two = mid.next;
        mid.next = null;
        return merge (one, reverse(two));
    }
    private ListNode midNode (ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private ListNode reverse (ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    private ListNode merge (ListNode one, ListNode two){
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (one != null && two != null){
            cur.next = one;
            one = one.next;
            cur.next.next = two;
            two = two.next;
            cur = cur.next.next;
        }
        if (one != null){
            cur.next = one;
        }
        else{
            cur.next = two;
        }
        return dummy.next;
    }
}
