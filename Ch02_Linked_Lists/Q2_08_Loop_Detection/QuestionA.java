class QuesitonA {
    /* Question 2.8 Loop Detection: Given a circular linked list, implement an algorithm that returns the node at the
    *  beginning of the loop. */
    public static LinkedListNode findBeginning(LinkedListNode head) {
        LinkedListNode fast = head;
        LinkedListNode slow = head;
        while(fast != null && fast.next !=null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) break;
        }

        if (fast == null || fast.next == null) return null;

        slow = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}