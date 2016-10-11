package Chapter2;

import Libary.Helper;
import Libary.LinkedListNode;

/**
 * Created by knoma on 10/10/16.
 */
public class Chapter_2_7 {

    public static void main(String[] arg) {
        int[] vals = {-1, -2, 0, 1, 2, 3, 4, 5, 6, 7, 8};

        LinkedListNode listNode1 = Helper.createLinkedListFromArray(vals);

        int[] vals2 = {12, 14, 15};

        LinkedListNode listNode2 = Helper.createLinkedListFromArray(vals2);

        listNode2.next.next  = listNode1.next.next.next.next;


        System.out.println(listNode1.printForward());
        System.out.println(listNode2.printForward());

        LinkedListNode intersection = findIntersection(listNode1, listNode2);
        System.out.println(intersection.printForward());
    }

    private static LinkedListNode findIntersection(LinkedListNode listNode1, LinkedListNode listNode2) {

        if (listNode1 == null || listNode2 == null) return null;

        Result result1 = getTailAndSize(listNode1);
        Result result2 = getTailAndSize(listNode2);

        if(result1.tail != result2.tail) return null;


        LinkedListNode shorter = result1.size < result2.size ? listNode1 : listNode2;
        LinkedListNode longer = result1.size < result2.size ? listNode2 : listNode1;

        longer = getKthNode(longer,Math.abs(result1.size -  result2.size));

        while (shorter != longer){
            shorter = shorter.next;
            longer = longer.next;
        }

        return longer;
    }

    private static LinkedListNode getKthNode(LinkedListNode node, int k) {
        LinkedListNode current = node;

        while (k > 0 && current != null){
            current = current.next;
            k--;
        }
        return current;
    }

    private static Result getTailAndSize(LinkedListNode n) {
        if (n == null) return null;

        int size =1;

        LinkedListNode current = n;

        while(current.next != null){
            size++;
            current = current.next;
        }
        return new Result(current, size);
    }

    private static class Result {
        public final LinkedListNode tail;
        public final int size;

        public Result(LinkedListNode tail, int size) {
            this.tail = tail;
            this.size = size;
        }
    }
}
