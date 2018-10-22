class QuestionB {
    public static LinkedListNode partition(LinkedListNode node, int x) {
        LinkedListNode beforeStart = null;
        LinkedListNode afterStart = null;

        while(node !=null) {
            LinkedListNode next = node.next;
            if(node.data < x) {
                /* Insert node into start of before list */
                node.next = beforeStart;
                beforeStart =  node;
            } else {
                /* Insert node into front of after list */
                node.next = afterStart;
                afterStart = node;
            }
            node = next;
        }

        if(beforeStart == null) return afterStart;
        LinkedListNode head = beforeStart;
        while (beforeStart.next != null) {
            beforeStart = beforeStart.next;
        }
        beforeStart.next = afterStart;
        return head;
    }
}