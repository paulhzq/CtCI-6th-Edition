class QuestionA {
    /*  Question 2.6 Palindrome: implement a function to check if a linked list is a palindrome. */

    // one approach is to reverse the linkedlist and compare
    public static boolean checkPalindrome(LinkedListNode head) {
        LinkedListNode reversed = reverseAndClone(head);
        return isEqual(head, reversed);
    }

    public static LinkedListNode reverseAndClone(LinkedListNode node) {
        LinkedListNode head = null;
        while(node !=null) {
            LinkedListNode n = new LinkedListNode(node.data);
            n.next =head;
            head = n;
            node = node.next;
        }
        return head;
    }

    public static boolean isEqual(LinkedListNode l1, LinkedListNode l2) {
        while(l1 !=null && l2 !=null) {
            if(l1.data !=l2.data) return false;
            l1 = l1.next;
            l2 = l2.next;
        }

        return l1 == null && l2 == null;
    }
}