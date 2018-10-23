class QuestionA {
    /* Question 2.5 Sum Lists: You have two numbers represented by a linked list, where each node contains a single
    digit. The digits are stored in reverse order, such that the 1's digit is at the head of the list. return the sum
    as a linked list.
    */
    public static LinkedListNode addLists(LinkedListNode l1, LinkedListNode l2) {
        int carry = 0;
        LinkedListNode res = new LinkedListNode(0);
        LinkedListNode runner = res;
        while(l1 !=null || l2 !=null || carry != 0) {
            int a = l1 == null ? 0 : l1.data;
            int b = l2 == null ? 0 : l2.data;
            int reminder = (a + b + carry) % 10;
            LinkedListNode tmp = new LinkedListNode(reminder);
            runner.next = tmp;
            runner = tmp;
            carry = (a + b + carry) / 10;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        return res.next;
    }
}