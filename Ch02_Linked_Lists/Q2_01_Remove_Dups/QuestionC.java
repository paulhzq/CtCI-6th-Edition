class QuestionC {
    /*
    Follow up: without buffer, and we look backwards for dups, and remove any that you see.
     */

    public static void deleteDups(LinkedListNode head) {
        if(head == null) return;
        LinkedListNode previous = head;
        LinkedListNode current = previous.next;
        while(current != null) {
            LinkedListNode runner = head;
            while(runner != current) {
                if(runner.data == current.data) {
                    LinkedListNode tmp = current.next;
                    previous.next = tmp;
                    current = tmp;
                    break; //we can't have more than dups since it will be deleted earlier.
                }
                runner = runner.next;
            }
            /* If runner == current, then we didn't find any duplicate
             * elements in the previous for loop.  We then need to
             * increment current.
             * If runner != current, then we must have hit the �break�
             * condition, in which case we found a dup and current has
             * already been incremented.*/
            if(runner == current) {
                previous = current;
                current = current.next;
            }
        }
    }
}