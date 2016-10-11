package Chapter2;

import Libary.Helper;
import Libary.LinkedListNode;

/**
 * Created by knoma on 10/9/16.
 */
public class Chapter2_2_1 {

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

    private static LinkedListNode printKthToLast(LinkedListNode head, int i) {
        Index idx = new Index();
        return printKthToLast(head, i, idx);
    }

    private static LinkedListNode printKthToLast(LinkedListNode head, int i, Index idx) {
        if(head ==null) return  null;

        LinkedListNode node = printKthToLast(head.next, i, idx);
        idx.value = idx.value + 1;

        if(idx.value == i) return head;

        return node;
    }


}
