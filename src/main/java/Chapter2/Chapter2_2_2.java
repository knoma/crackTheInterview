package Chapter2;

import Libary.Helper;
import Libary.LinkedListNode;

/**
 * Created by knoma on 10/9/16.
 */
public class Chapter2_2_2 {

    static class Index {
        public int value = 0;
    }



    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6};
        LinkedListNode head = Helper.createLinkedListFromArray(array);
        for (int i = 0; i <= array.length + 1; i++) {
            LinkedListNode linkedListNode = printKthToLast(head, i);
            System.out.println(linkedListNode);
        }
    }

    private static LinkedListNode printKthToLast(LinkedListNode head, int k) {

        LinkedListNode p1 = head;
        LinkedListNode p2 = head;


        for (int i = 0; i < k; i++) {
            if(p1 == null) return null;
            p1 = p1.next;
        }

        while (p1 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }



}
