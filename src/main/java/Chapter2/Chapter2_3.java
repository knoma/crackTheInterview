package Chapter2;

import Libary.Helper;
import Libary.LinkedListNode;

/**
 * Created by knoma on 10/10/16.
 */
public class Chapter2_3 {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6};
        LinkedListNode head = Helper.createLinkedListFromArray(array);
        deleteMidNode(head.next.next.next);
        System.out.println(head.printForward());
    }

    private static boolean deleteMidNode(LinkedListNode head) {

        if(head == null || head.next == null) return false;

        LinkedListNode next = head.next;

        head.data = next.data;
        head.next = next.next;
        return true;
    }
}
