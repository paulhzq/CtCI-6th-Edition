class QuestionA {
    /*
    Question 2.1 Return Kth to Last: Implement an algorithm to find the kth to last element of a single linked list.
     */

    public static int printKthToLast(LinkedListNode head, int k) {
        if(head == null) return 0;
        int index = printKthToLast(head.next, k)+1;
        if(index == k) {
            System.out.println(head.data);
        }
        return index;
    }
}