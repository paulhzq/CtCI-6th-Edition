import java.util.*;

class LinkedListNode {
    public LinkedListNode next;
    public LinkedListNode prev;
    public LinkedListNode last;
    public int data;
    public LinkedListNode(int d, LinkedListNode n, LinkedListNode p) {
        data = d;
        setNext(n);
        setPrevious(p);
    }

    public LinkedListNode(int d) {
        data = d;
    }

    public LinkedListNode() { }

    public void setNext(LinkedListNode n) {
        next = n;
        if (this == last) {
            last = n;
        }
        if (n != null && n.prev != this) {
            n.setPrevious(this);
        }
    }

    public void setPrevious(LinkedListNode p) {
        prev = p;
        if (p != null && p.next != this) {
            p.setNext(this);
        }
    }

    public String printForward() {
        if (next != null) {
            return data + "->" + next.printForward();
        } else {
            return ((Integer) data).toString();
        }
    }

    public LinkedListNode clone() {
        LinkedListNode next2 = null;
        if (next != null) {
            next2 = next.clone();
        }
        LinkedListNode head2 = new LinkedListNode(data, next2, null);
        return head2;
    }
}


class QuestionA {
    /*
    Question 2.1 Remove Dups: Write code to remove duplicates from an unsorted linked list.
    Follow up: How would you solve this problem if a temporary buffer is not allowed?
     */
    public static void deleteDups(LinkedListNode n) {
        HashSet<Integer> hs = new HashSet<Integer>();
        LinkedListNode previous = null;
        while(n !=null) {
            if(hs.contains(n.data)) {
                previous.next = n.next;
            } else {
                hs.add(n.data);
                previous.next = n;
            }
            n = n.next;
        }
    }
}