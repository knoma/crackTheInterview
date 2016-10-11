package Chapter2;

import Libary.LinkedListNode;
import java.util.Stack;


/**
 * Created by knoma on 10/10/16.
 */
public class Chapter_2_6 {

    public static void main(String[] args) {
        int length  = 9;

        LinkedListNode[] nodes = new LinkedListNode[length];

        for (int i = 0; i < length; i++) {
            nodes[i] = new LinkedListNode(i >= length / 2 ? length - i - 1 : i, null, null);
        }

        for (int i = 0; i < length; i++) {
            if(i < length -1) {
                nodes[i].next = nodes[i +1];
            }

            if(i > 0) {
                nodes[i].prev = nodes[i -1];
            }
        }

        LinkedListNode head = nodes[0];

        System.out.println(head.printForward());
        System.out.println(IsPalindrome2(head));
    }

    private static boolean IsPalindrome2(LinkedListNode head) {

        LinkedListNode fast = head;
        LinkedListNode slow = head;


        Stack<Integer> stack = new Stack<>();

        while (fast !=null && fast.next != null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        while (slow !=null){
            int top = stack.pop().intValue();
            if(top != slow.data) return false;
            slow = slow.next;
        }

        return true;
    }

    private static boolean IsPalindrome(LinkedListNode head) {
        LinkedListNode reverse = reverseAndClone(head);
        return isEqual(head,reverse);
    }

    private static boolean isEqual(LinkedListNode one, LinkedListNode two) {
        while (one != null && two != null){
            if (one.data != two.data) return  false;

            one = one.next;
            two = two.next;
        }
        return one == null && two == null;
    }

    private static LinkedListNode reverseAndClone(LinkedListNode node) {
       LinkedListNode head = null;
        while ( node !=null){
            LinkedListNode n = new LinkedListNode(node.data);
            n.next = head;
            head = n;
            node = node.next;
        }
        return head;
    }
}
