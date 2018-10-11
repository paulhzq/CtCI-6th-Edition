class QuestionC {
    public static LinkedListNode nthToLast(LinkedListNode head, int k) {
        LinkedListNode p1 = head;
        LinkedListNode p2 = head;
        int i =0;
        while(i<k) {
            if(p2==null) return null;
            p2=p2.next;
            i++;
        }
        while(p2!=null) {
            p1=p1.next;
            p2=p2.next;
        }
        return p1;
    }
}