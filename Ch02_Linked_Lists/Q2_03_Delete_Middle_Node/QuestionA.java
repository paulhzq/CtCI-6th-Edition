class QuestionA {
    /*
    Question 2.3 Delete Middle Node: Implement an algorithm to delete a node in the middle(ie., any node but the first
    and last node, not necessarily the exact middle) of a single linked list, given only access to that node.
     */
    public static boolean deleteMiddleNode(LinkedListNode middle) {
        if(middle == null || middle.next == null) return false;
        LinkedListNode next = middle.next;
        middle.data = next.data;
        middle.next = next.next;
        return true;
    }
}