class QuestionB {
    /*
    Follow up, we don't want to use the buffer, then for each node we need to loop the entire list to check if it
    has duplicate node.
     */

    public static void deleteDups(LinkedListNode head) {
        LinkedListNode runner = head;
        while(runner !=null) {
            int tmp = runner.data;
            LinkedListNode t = runner;
            while(t.next !=null) {
                if(t.next.data == tmp) {
                    t.next = t.next.next;
                } else {
                    t = t.next;
                }
            }
            runner = runner.next;
        }
    }
}