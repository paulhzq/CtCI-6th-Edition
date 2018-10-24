import java.util.*;

class QuestionB {
    // Get the first half data in stack and compare with the second half.
    public static boolean checkPalindrome(LinkedListNode head) {
        LinkedListNode fast = head;
        LinkedListNode slow = head;

        Stack<Integer> stack = new Stack<Integer>();

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            stack.push(slow.data);
            slow =slow.next;
        }

        if(fast != null) {
            slow = slow.next;
        }

        while(slow != null) {
            if(stack.pop().intValue() != slow.data) return false;
            slow = slow.next;
        }
        return true;
    }
}