public class SplitLinkedList {
    public class splitLinkedList {
        public ListNode[] deleteN(ListNode root, int k) {
            ListNode cur = root;
            int N = 0;
            //calculate how many numbers in linkedlist
            while (cur != null) {
                cur = cur.next;
                N++;
            }
            //devided by k to get the size
            int size = N / k, extra = N % k;
            //create a new linkedlist with size k
            ListNode[] ans = new ListNode[k];
            cur = root;
            for (int i = 0; i < k; ++i) {
                ListNode head = cur;
                for (int j = 0; j < size + (i < extra ? 1 : 0) - 1; ++j) {
                    if (cur != null) cur = cur.next;
                }
                if (cur != null) {
                    ListNode prev = cur;
                    cur = cur.next;
                    prev.next = null;
                }
                ans[i] = head;
            }
            return ans;
        }
    }

}
