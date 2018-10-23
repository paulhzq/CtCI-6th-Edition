class QuestionB {
    /* Follow up: suppose the digits are stored in forward order. */

    // reverse l1 and l2, then reuse the addLists in QuestionA.
    // Or use stack to get all the data in l1 and l2, then pop the value in stack, if stack is empty use 0 to add.
    public static LinkedListNode addLists(LinkedListNode l1, LinkedListNode l2) {
        l1 = reverseList(l1);
        l2 = reverseList(l2);
        LinkedListNode res = QuestionA.addLists(l1,l2);
        res = reverseList(res);
        return res;
    }
    public static LinkedListNode reverseList(LinkedListNode li) {
        LinkedListNode prev = null;
        LinkedListNode current = li;
        LinkedListNode next = null;
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}